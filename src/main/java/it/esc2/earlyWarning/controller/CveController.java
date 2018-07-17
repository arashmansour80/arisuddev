/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.controller;

import it.esc2.earlyWarning.domain.Cve;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import com.codahale.metrics.annotation.Timed;

import it.esc2.earlyWarning.service.dto.CveDTO;
import javax.validation.Valid;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.net.URISyntaxException;
import it.esc2.earlyWarning.repository.CveRepository;
import it.esc2.earlyWarning.service.CveService;

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
    public CveDTO updateConfiguration(@Valid @RequestBody CveDTO cveDto) throws URISyntaxException {
        log.debug("REST request to update Sinistri : {}", cveDto);
//           if (cveDto.getId() == null) {
//            return createCve(cveDto);
//        }

        CveDTO result = this.cveService.save(cveDto);
        return result;

        /*ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert("cve", cveDto.getId()))
                .body(result);*/
    }

//    @GetMapping("/cve/{id}")
//    public Cve findByIdCve(@PathVariable("id") String id) {
//        Cve doc = this.cveRepository.findByIdCve(id);
//        return doc;
//    }
}
