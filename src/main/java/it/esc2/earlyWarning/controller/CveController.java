/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.controller;

import com.codahale.metrics.annotation.Timed;
import it.esc2.earlyWarning.domain.Cve;
import it.esc2.earlyWarning.repository.CveRepository;
import it.esc2.earlyWarning.service.CveService;
import it.esc2.earlyWarning.service.dto.CveDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import com.querydsl.core.types.dsl.BooleanExpression;
import it.esc2.earlyWarning.base.AccessComplexityBase;
import it.esc2.earlyWarning.base.AccessVectorBase;
import it.esc2.earlyWarning.base.AuthenticationBase;
import it.esc2.earlyWarning.base.AvailabilityImpactBase;
import it.esc2.earlyWarning.base.ConfidentialityImpactBase;
import it.esc2.earlyWarning.base.IntegrityImpactBase;
import it.esc2.earlyWarning.domain.QCve;
import it.esc2.earlyWarning.environmental.AvailabilityImpactEnv;
import it.esc2.earlyWarning.environmental.CollateralDamagePotentialEnv;
import it.esc2.earlyWarning.environmental.ConfidentialityImpactEnv;
import it.esc2.earlyWarning.environmental.IntegrityImpactEnv;
import it.esc2.earlyWarning.environmental.TargetDistributionEnv;
import it.esc2.earlyWarning.service.CpeService;
import it.esc2.earlyWarning.service.SwlService;
import it.esc2.earlyWarning.service.dto.CpeDTO;
import it.esc2.earlyWarning.service.dto.SwlDTO;
import it.esc2.earlyWarning.temporal.Exploitability;
import it.esc2.earlyWarning.temporal.RemediationLevel;
import it.esc2.earlyWarning.temporal.ReportConfidence;

/**
 *
 * @author a.mansour
 */
@RestController
@RequestMapping("/api")
public class CveController {

    private final Logger log = LoggerFactory.getLogger(CveController.class);

    private CveService cveService;
    private CveRepository cveRepository;
    private SwlService swlService;
    private CpeService cpeService;

    public CveController(CveService cveService, CveRepository cveRepository,SwlService swlService, CpeService cpeService) {
        this.cveService = cveService;
        this.cveRepository = cveRepository;
        this.swlService = swlService;
        this.cpeService = cpeService;
    }

    // Todo call all method just from service 
//    @GetMapping("/{id}")
//    public Optional<Cve> findById(@PathVariable("id") String id) {
//        Optional<Cve> cve = this.cveRepository.findById(id);
//        return cve;
//    }
//    @GetMapping("/vuln/{lastModifiedDate}")
//    public List<Cve> findByLastModifiedDate(@PathVariable("lastModifiedDate") String date) {
//        List<Cve> cveList = this.cveRepository.findBylastModifiedDate(date);
//        return cveList;
//    }
    @GetMapping("/all")
    public List<Cve> getAll() {
        List<Cve> cves = this.cveRepository.findAll();
        return cves;
    }

    @PutMapping("/cves/upd")
    @Timed                                          //configurationDTO configurationDTO
    public ResponseEntity<String> updateConfiguration(@Valid @RequestBody CveDTO cveDto) throws URISyntaxException {
        log.debug("REST request to update CVE Document  : {}", cveDto);
        HttpStatus resultStatus = null;
        CveDTO result = null;
        try {
            Cve byvulnCveId = cveRepository.findByvulnCveId(cveDto.getVulnCveId());
            //Optional<Cve> cveById = cveRepository.findById(cveDto.getIdCve());
            if (byvulnCveId == null) {
                result = this.cveService.save(cveDto);
                resultStatus = HttpStatus.OK;
                return new ResponseEntity<String>(" new CVE is created " + result.getIdCve(), resultStatus);
            } else {

                cveDto.setId(byvulnCveId.getId());
                result = this.cveService.save(cveDto);
                resultStatus = HttpStatus.OK;
                return new ResponseEntity<String>(" CVE is updated " + result.getIdCve(), resultStatus);
            }

        } catch (Exception e) {
            String message = "Errore INFRASTRUTTURALE durante aggiornare o salvare il cve " + cveDto.getIdCve();
            log.error(message, e);
            resultStatus = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<String>("Error in calling the service ", resultStatus);
        }
    }

//    @GetMapping("/cve/{id}")
//    public Cve findByIdCve(@PathVariable("id") String id) {
//        Cve doc = this.cveRepository.findByIdCve(id);
//        return doc;
//    }
    @GetMapping("/{id}")
    public Optional<Cve> getById(@PathVariable("id")String id)throws Exception{
        Optional<Cve> cve = this.cveRepository.findById(id);
        return cve;
    }

    @GetMapping("/product/{product}")
    public List<Cve> searchProduct(@PathVariable("product") String vulnProduct) {
        QCve qcve = new QCve("cve");
        BooleanExpression filter = qcve.vulnVulnerableSoftwareList.vulnProduct.contains(vulnProduct);

        List<Cve> cves = (List<Cve>) this.cveRepository.findAll(filter);
        return cves;
    }

    @GetMapping("/score/{score}/{date}")
    public List<Cve> searchByScore(@PathVariable("score") Integer score, @PathVariable("date") String date) {
        QCve qcve = new QCve("cve");
        BooleanExpression filter = qcve.vulnCvss.cvssBaseMetrics.cvssScore.eq(score);
        BooleanExpression filter_ = qcve.vulnPublishedDatetime.eq(date);

        List<Cve> cves = (List<Cve>) this.cveRepository.findAll(filter.and(filter_));
        return cves;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") String id) throws Exception {
        log.debug("DELETE request For ID : {}", id);
        HttpStatus resultStatus = null;
        Optional<Cve> byvulnCve = cveRepository.findById(id);
        try {
            if (!byvulnCve.isPresent()) {
                resultStatus = HttpStatus.NOT_FOUND;
                return new ResponseEntity<>(" There isn't the document with id:  " + id, resultStatus);
            } else {
                this.cveRepository.deleteById(id);
                resultStatus = HttpStatus.OK;
                return new ResponseEntity<>(" This Document has been removed from cve collection " + id, resultStatus);
            }
        } catch (Exception e) {
             String message = "Deleteing erroe for id:" +id;
            log.error(message, e);
            resultStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<>("Error in calling the delete from repository ", resultStatus);// TODO the messages should be change
        }

    }
  /////////////////////////////////////test for leo  
    @PutMapping("/up/{id}")
    public void findByIdCve(@PathVariable("id") String id) throws Exception{
        String idQ ="CVE-2005-3656" ;
        QCve qCve = new QCve("cve");
        BooleanExpression be = qCve.idCve.eq(id);
         Cve cc=null;
        
         List<Cve> cves = (List<Cve>) this.cveRepository.findAll(be);
        if(cves!=null){
            cves.get(0).getVulnCvss().getCvssBaseMetrics().setCvssScore(191); 
             cc = cves.get(0);
            log.debug("Cve is not null");
        }
        
        Cve ee = this.cveRepository.save(cc);
        
    }
    
    /////////////////////////////////////
    
    @GetMapping("/cvid/{id}")
    public CveDTO searchIdCve(@PathVariable("id") String idcve)throws Exception{  // TODO manage exeption and response Entity     
        CveDTO cveDto = this.cveService.searchIdCve(idcve);
        return cveDto;         
    }
    
    // find cpe2.3 name from sw collection by software name
    @GetMapping("/sw/{name}")
    public SwlDTO findCpeName(@PathVariable("name") String swName)throws Exception{ // // TODO manage exeption and response Entity   and move it to new controller
        SwlDTO searchBySoftwareName = this.swlService.searchBySoftwareName(swName);
        return searchBySoftwareName;
    }
    
    // find cpe from cpe collection by cpe2.3 name
    @GetMapping("/cpe/{name}")
    public CpeDTO findCpe(@PathVariable("name") String cpeName) throws Exception{ // // TODO manage exeption and response Entity   and move it to new controller
        CpeDTO searchByCpe23 = this.cpeService.searchByCpe23(cpeName);
        return searchByCpe23;
    }
    
    // get cve by passing software name
    @GetMapping("/cves/{software}")
    public List<CveDTO> findCveBySoftware(@PathVariable("software") String swName ) throws Exception{// TODO manage exeption and response Entity
        SwlDTO cpeNameFromSwl = findCpeName(swName);
        CpeDTO cpe = findCpe(cpeNameFromSwl.getCpe());
        List<CveDTO> cveListResult = findCveByCpe(cpe.getName());  
        if(cveListResult == null){
            log.info("there is not any cve with the software name :"+swName);
        }
        return cveListResult;
    }
    
    @GetMapping("/cve/{cpe}")
    public List<CveDTO> findCveByCpe(@PathVariable("cpe") String cpeName) throws Exception{ // TODO manage exeption and response Entity
        List<CveDTO> cveListResult = this.cveService.searchByCpeName(cpeName);
        return cveListResult;
        
    }
    
    
    
  
    
    public Double temporalScoreEquation(Exploitability exploitability, RemediationLevel remediationLevel, ReportConfidence reportConfidence,
            ConfidentialityImpactBase ciB, IntegrityImpactBase iiB, AvailabilityImpactBase aiB, AccessComplexityBase acB, AuthenticationBase authB,AccessVectorBase avB){  
        Double baseScore = baseScoreEquation(ciB, iiB, aiB, acB, authB, avB);
        Double exploitabilityResult = exploitability.getExploitabilityAmount();
        Double remediationLevelResult = remediationLevel.getRlAmount();
        Double reportConfidenceResult = reportConfidence.getRcAmount();
        return baseScore * exploitabilityResult * remediationLevelResult * reportConfidenceResult;       
        
    }
    // TODO create constant for all values that used here 
    public Double impactEquation(ConfidentialityImpactBase cib, IntegrityImpactBase iib, AvailabilityImpactBase aib) {
        Double impact = 10.41 * (1 - (1 - cib.getCiAmount()) * (1 - iib.getIiAmount()) * (1 - aib.getAiAmount()));
        return impact;
    }
    
    public Double exploitabilityEquation(AccessComplexityBase acb, AuthenticationBase authB,AccessVectorBase avb ){        
        Double exploitabilityResult = 20 * acb.getAcAmount()*authB.getAuthAmount()*avb.getAvAmount();        
        return exploitabilityResult;
    }
    
    public Double impactFunction(Double impactResult) {
        Double impact = null;
        if (impactResult == 0) {
            impact = 0.0;
        } else {
            impact = 1.176;
        }
        return impact;
    }
    
    
    public Double baseScoreEquation(ConfidentialityImpactBase ciB, IntegrityImpactBase iiB, AvailabilityImpactBase aiB, AccessComplexityBase acB, AuthenticationBase authB, AccessVectorBase avB) {
        Double baseScoreResult = (0.6 * impactEquation(ciB, iiB, aiB) + 0.4 * exploitabilityEquation(acB, authB, avB) - 1.5) * impactFunction(impactEquation(ciB, iiB, aiB));
        return baseScoreResult;
    }
    
    
    public Double adjustedImpactEquation(ConfidentialityImpactBase ciB, ConfidentialityImpactEnv ciE, IntegrityImpactBase iiB, IntegrityImpactEnv iiE, AvailabilityImpactBase aiB, AvailabilityImpactEnv aiE) {
        Double adjImpactResult = Math.min(10, 10.41 * (1 - (1 - ciB.getCiAmount() - ciE.getCiAmount()) * (1 - iiB.getIiAmount() - iiE.getIiAmount()) * (1 - aiB.getAiAmount() - aiE.getAiAmount())));
        return adjImpactResult;
    }
    
    
    // note: for calculating adjusted temporal needs to recalculate temporal, but in base score result we need to use adjust Impact instead of impact.
    public Double baseScoreAdjustedEquation(ConfidentialityImpactBase ciB, IntegrityImpactBase iiB, AvailabilityImpactBase aiB, AccessComplexityBase acB, AuthenticationBase authB, AccessVectorBase avB,
            ConfidentialityImpactEnv ciE, IntegrityImpactEnv iiE, AvailabilityImpactEnv aiE) {
        Double baseScoreAdjustedResult = (0.6 * adjustedImpactEquation(ciB, ciE, iiB, iiE, aiB, aiE) + 0.4 * exploitabilityEquation(acB, authB, avB) - 1.5) * impactFunction(adjustedImpactEquation(ciB, ciE, iiB, iiE, aiB, aiE));
        return baseScoreAdjustedResult;
    }
    
    
    // TODO: we can use temporalScoreEquation if pass the basescore as parameter
    public Double adjustedTemporalEquation(ConfidentialityImpactBase ciB, IntegrityImpactBase iiB, AvailabilityImpactBase aiB, AccessComplexityBase acB,
            AuthenticationBase authB, AccessVectorBase avB, ConfidentialityImpactEnv ciE, IntegrityImpactEnv iiE, AvailabilityImpactEnv aiE,
            Exploitability exploitability, RemediationLevel remediationLevel, ReportConfidence reportConfidence) {
        Double baseScoreAdjustedResult = baseScoreAdjustedEquation(ciB, iiB, aiB, acB, authB, avB, ciE, iiE, aiE);
        Double exploitabilityResult = exploitability.getExploitabilityAmount();
        Double remediationLevelResult = remediationLevel.getRlAmount();
        Double reportConfidenceResult = reportConfidence.getRcAmount();
        return baseScoreAdjustedResult * exploitabilityResult * remediationLevelResult * reportConfidenceResult;
    }

    
    
    
    public Double environmentalScoreEquation(ConfidentialityImpactBase ciB, IntegrityImpactBase iiB, AvailabilityImpactBase aiB, AccessComplexityBase acB, AuthenticationBase authB, AccessVectorBase avB,
            ConfidentialityImpactEnv ciE, IntegrityImpactEnv iiE, AvailabilityImpactEnv aiE, Exploitability exploitability, RemediationLevel remediationLevel, ReportConfidence reportConfidence,
            CollateralDamagePotentialEnv cdpE, TargetDistributionEnv tdE) {
        Double adjustedTemporalResult = adjustedTemporalEquation(ciB, iiB, aiB, acB, authB, avB, ciE, iiE, aiE, exploitability, remediationLevel, reportConfidence);

        Double envScoreResult = (adjustedTemporalResult + (10 - adjustedTemporalResult) * cdpE.getCdpAmoubt()) * tdE.getTdAmount();
        return envScoreResult;
    }
    
    
    
    @GetMapping("/te")
    public void firstTest(){
        // Double test1 = baseScoreEquation(ConfidentialityImpactBase.PARTIAL, IntegrityImpactBase.COMPLETE, AvailabilityImpactBase.COMPLETE, AccessComplexityBase.LOW, AuthenticationBase.NO_AUTHENTICATION, AccessVectorBase.NETWORK_ACCESSIBLE);
       // Double res = baseScoreAdjustedEquation(ConfidentialityImpactBase.PARTIAL, IntegrityImpactBase.COMPLETE, AvailabilityImpactBase.COMPLETE, AccessComplexityBase.LOW, AuthenticationBase.NO_AUTHENTICATION, AccessVectorBase.NETWORK_ACCESSIBLE, ConfidentialityImpactEnv.LOW, IntegrityImpactEnv.LOW, AvailabilityImpactEnv.LOW);
        environmentalScoreEquation(ConfidentialityImpactBase.PARTIAL, IntegrityImpactBase.COMPLETE, AvailabilityImpactBase.COMPLETE, AccessComplexityBase.LOW, AuthenticationBase.NO_AUTHENTICATION, AccessVectorBase.NETWORK_ACCESSIBLE, ConfidentialityImpactEnv.LOW, IntegrityImpactEnv.LOW, AvailabilityImpactEnv.LOW, Exploitability.UNPROVEN, RemediationLevel.NOT_DEFINED, ReportConfidence.UNCONFIRMED, CollateralDamagePotentialEnv.NONE, TargetDistributionEnv.NONE);
        log.debug("end");
    }
    
    
    
    
    
    
    
   
    
}
