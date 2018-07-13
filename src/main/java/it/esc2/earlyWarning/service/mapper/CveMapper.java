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

    CveDTO CveToCveDTO(Cve Cve);

    List<CveDTO> CvesToCveDTOs(List<Cve> Cves);

    Cve CveDTOToCve(CveDTO CveDTO);

    List<Cve> CveDTOsToCves(List<CveDTO> CveDTOs);

}
