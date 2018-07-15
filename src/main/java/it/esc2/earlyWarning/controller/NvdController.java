/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.controller;

import it.esc2.earlyWarning.domain.Cve;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import com.codahale.metrics.annotation.Timed;
import it.esc2.earlyWarning.domain.Configurations;
import it.esc2.earlyWarning.domain.Nvd;
import it.esc2.earlyWarning.service.dto.NvdDTO;
import javax.validation.Valid;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.net.URISyntaxException;
import javax.inject.Inject;
import it.esc2.earlyWarning.service.NvdService;
import it.esc2.earlyWarning.repository.NvdRepository;

/**
 *
 * @author a.mansour
 */

@RestController
@RequestMapping("/cves")
public class NvdController {

    private final Logger log = LoggerFactory.getLogger(NvdController.class);

  
    private NvdService nvdService;  
    private NvdRepository nvdRepository;

    public NvdController(NvdService nvdService, NvdRepository nvdRepository) {
        this.nvdService = nvdService;
        this.nvdRepository = nvdRepository;
    }
    
    

  
    
    

//    public NvdController(NvdRepository cveRepository) {
//        this.cveRepository = cveRepository;
//    }
    
    // Todo call all method just from service 
    @GetMapping("/{id}")
    public Optional<Nvd> findById(@PathVariable("id") String id) {
        Optional<Nvd> nvd = this.nvdRepository.findById(id);
        return nvd;
    }

    @GetMapping("/vuln/{lastModifiedDate}")
    public List<Nvd> findByLastModifiedDate(@PathVariable("lastModifiedDate") String date) {
        List<Nvd> nvdList = this.nvdRepository.findBylastModifiedDate(date);
        return nvdList;
    }

    @GetMapping("/all")
    public List<Nvd> getAll() {
        List<Nvd> nvds = this.nvdRepository.findAll();
        return nvds;
    }



    @PutMapping("/cves/upd")
    @Timed                                          //configurationDTO configurationDTO
    public NvdDTO updateConfiguration(@Valid @RequestBody NvdDTO nvdDto) throws URISyntaxException {
        log.debug("REST request to update Sinistri : {}", nvdDto);
//           if (cveDto.getId() == null) {
//            return createCve(cveDto);
//        }

        NvdDTO result = this.nvdService.save(nvdDto);
        return result;
        
        /*ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert("cve", cveDto.getId()))
                .body(result);*/
    }

}
