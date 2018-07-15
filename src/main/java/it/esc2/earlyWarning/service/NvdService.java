/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service;

import it.esc2.earlyWarning.service.dto.NvdDTO;

/**
 *
 * @author a.mansour
 */
/**
 * Service Interface for managing Cve.
 */
public interface NvdService {

    /**
     * Save a nvd.
     *
     * @param nvdDTO the entity to save
     * @return the persisted entity
     */
    NvdDTO save(NvdDTO nvdDTO);
}
