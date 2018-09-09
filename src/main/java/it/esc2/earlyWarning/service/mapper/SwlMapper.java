/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.mapper;

import it.esc2.earlyWarning.domain.Swl;
import it.esc2.earlyWarning.service.dto.SwlDTO;
import org.mapstruct.Mapper;

/**
 *
 * @author a.mansour
 */
@Mapper(componentModel = "spring", uses = {})
public interface SwlMapper {
    SwlDTO swlToSwlDto(Swl swl);
    
}
