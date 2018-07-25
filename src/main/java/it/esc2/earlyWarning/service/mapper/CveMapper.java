/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.mapper;

import it.esc2.earlyWarning.domain.*;
import it.esc2.earlyWarning.service.dto.CveDTO;
import java.util.List;
import org.mapstruct.*;

/**
 *
 * @author a.mansour
 */
/**
 * Mapper for the entity Cve and its DTO CveDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CveMapper {

    CveDTO cveToCveDTO(Cve cve);

    List<CveDTO> cvesToCveDTOs(List<Cve> cve);

    Cve cveDTOTocve(CveDTO cveDTO);

    List<Cve> cveDTOsToCves(List<CveDTO> cveDTOs);    

}
