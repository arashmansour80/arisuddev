/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.mapper;

import it.esc2.earlyWarning.domain.Cpe;
import it.esc2.earlyWarning.service.dto.CpeDTO;
import org.mapstruct.Mapper;

/**
 *
 * @author a.mansour
 */
@Mapper(componentModel = "spring", uses = {})
public interface CpeMapper {
    
    CpeDTO cpeToCpeDto(Cpe cpe);
    
}
