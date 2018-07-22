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

/**
 *
 * @author a.mansour
 */
@RestController
@RequestMapping("/cves")
public class CveController {

    private final Logger log = LoggerFactory.getLogger(CveController.class);

    private CveService cveService;
    private CveRepository cveRepository;

    public CveController(CveService cveService, CveRepository cveRepository) {
        this.cveService = cveService;
        this.cveRepository = cveRepository;
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
        log.debug("REST request to update Sinistri : {}", cveDto);
        HttpStatus resultStatus = null;
        CveDTO result = null;
        try {
            Cve byvulnCveId = cveRepository.findByvulnCveId(cveDto.getVulnCveId());
            //Optional<Cve> cveById = cveRepository.findById(cveDto.getIdCve());
            if(byvulnCveId == null) {
                result = this.cveService.save(cveDto);
                resultStatus = HttpStatus.OK;
                return new ResponseEntity<String>(" new CVE is created "+result.getIdCve(),resultStatus);
            }
            else{

                cveDto.setId(byvulnCveId.getId());
                result = this.cveService.save(cveDto);
                resultStatus = HttpStatus.OK;
                return new ResponseEntity<String>(" CVE is updated "+result.getIdCve(),resultStatus);
            }

        } catch(Exception e){
            String message = "Errore INFRASTRUTTURALE durante aggiornare o salvare il cve "+cveDto.getIdCve();
            log.error(message, e);
            resultStatus = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<String>("Error in calling the service ",resultStatus);
        }
    }

//    @GetMapping("/cve/{id}")
//    public Cve findByIdCve(@PathVariable("id") String id) {
//        Cve doc = this.cveRepository.findByIdCve(id);
//        return doc;
//    }
    @GetMapping("/{id}")
    public Optional<Cve> getById(@PathVariable("id")String id){
         Optional<Cve> cve = this.cveRepository.findById(id);
        return cve;
    }
}
