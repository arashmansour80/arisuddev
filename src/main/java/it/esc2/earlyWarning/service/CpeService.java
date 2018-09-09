/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service;

import it.esc2.earlyWarning.service.dto.CpeDTO;

/**
 *
 * @author a.mansour
 */
public interface CpeService {
    CpeDTO searchByCpe23(String name);
}
