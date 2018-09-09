/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service;

import it.esc2.earlyWarning.service.dto.SwlDTO;

/**
 *
 * @author a.mansour
 */
public interface SwlService {
   
    SwlDTO searchBySoftwareName(String name);
    
}
