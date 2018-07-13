/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.impl;

import it.esc2.earlyWarning.domain.Cve;
import it.esc2.earlyWarning.repository.ICveRepository;
import it.esc2.earlyWarning.service.CveService;
import it.esc2.earlyWarning.service.dto.CveDTO;
import it.esc2.earlyWarning.service.mapper.CveMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import org.springframework.stereotype.Repository;

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

    @Inject
    private ICveRepository cveRepository;

    @Inject
    private CveMapper cveMapper;

    /**
     * Save a cve.
     *
     * @param cveDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public CveDTO save(CveDTO cveDTO) {
        log.debug("Request to save Cve : {}", cveDTO);
        Cve cve = cveMapper.CveDTOToCve(cveDTO);
        cve = cveRepository.save(cve);
        CveDTO result = cveMapper.CveToCveDTO(cve);
        return result;
    }

}
