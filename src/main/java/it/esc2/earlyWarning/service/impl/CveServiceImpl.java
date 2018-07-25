/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.impl;

import it.esc2.earlyWarning.domain.Cve;
import it.esc2.earlyWarning.service.dto.CveDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import it.esc2.earlyWarning.service.mapper.CveMapper;
import it.esc2.earlyWarning.repository.CveRepository;
import it.esc2.earlyWarning.service.CveService;

/**
 *
 * @author a.mansour
 */
/**
 * Service Implementation for managing cve.
 */
@Service
@Transactional
public class CveServiceImpl implements CveService {

    private final Logger log = LoggerFactory.getLogger(CveServiceImpl.class);

    private CveRepository cveRepository;
    private CveMapper cveMapper;

    public CveServiceImpl(CveRepository cveRepository, CveMapper cveMapper) {
        this.cveRepository = cveRepository;
        this.cveMapper = cveMapper;
    }

    @Override
    public CveDTO save(CveDTO cveDTO) {
        log.debug("Request to save Cve : {}", cveDTO);
        Cve cve = cveMapper.cveDTOTocve(cveDTO);
        cve = cveRepository.save(cve);
        CveDTO result = cveMapper.cveToCveDTO(cve);
        return result;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CveDTO searchIdCve(String idCve) {
        Cve cve = this.cveRepository.findByidCve(idCve);  
        CveDTO result = cveMapper.cveToCveDTO(cve);
        return result;
    }

    /**
     * Save a cve.
     *
     * @param cveDTO the entity to save
     * @return the persisted entity
     */
//    @Override
//    public CveDTO save(CveDTO cveDTO) {
//        log.debug("Request to save Cve : {}", cveDTO);
//        Cve cve = cveMapper.cveDTOTocve(cveDTO);
//        cve = cveRepository.save(cve);
//        CveDTO result = cveMapper.cveToCveDTO(cve);
//        return result;
//    }
    
}
