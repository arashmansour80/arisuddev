/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.impl;

import it.esc2.earlyWarning.domain.Cve;
import it.esc2.earlyWarning.domain.Nvd;
import it.esc2.earlyWarning.service.dto.NvdDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import it.esc2.earlyWarning.service.NvdService;
import it.esc2.earlyWarning.repository.NvdRepository;
import it.esc2.earlyWarning.service.mapper.NvdMapper;

/**
 *
 * @author a.mansour
 */
/**
 * Service Implementation for managing cve.
 */
@Service
@Transactional
public class NvdServiceImpl implements NvdService {

    private final Logger log = LoggerFactory.getLogger(NvdServiceImpl.class);

    private NvdRepository nvdRepository;
    private NvdMapper nvdMapper;

    public NvdServiceImpl(NvdRepository nvdRepository, NvdMapper nvdMapper) {
        this.nvdRepository = nvdRepository;
        this.nvdMapper = nvdMapper;
    }

  

    /**
     * Save a nvd.
     *
     * @param nvdDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public NvdDTO save(NvdDTO nvdDTO) {
        log.debug("Request to save Cve : {}", nvdDTO);
        Nvd nvd = nvdMapper.nvdDTOToNvd(nvdDTO);
        nvd = nvdRepository.save(nvd);
        NvdDTO result = nvdMapper.nvdToNvdDTO(nvd);
        return result;
    }

}
