/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.impl;

import it.esc2.earlyWarning.domain.Swl;
import it.esc2.earlyWarning.repository.SwlRepository;
import it.esc2.earlyWarning.service.SwlService;
import it.esc2.earlyWarning.service.dto.SwlDTO;
import it.esc2.earlyWarning.service.mapper.SwlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author a.mansour
 */
@Service
@Transactional
public class SwlServiceImpl implements SwlService {

    private final Logger log = LoggerFactory.getLogger(SwlServiceImpl.class);

    private SwlRepository swlRepository;
    private SwlMapper swlMapper;

    public SwlServiceImpl(SwlRepository swlRepository, SwlMapper swlMapper) {
        this.swlRepository = swlRepository;
        this.swlMapper = swlMapper;
    }

     
    // get cpe name from sw collection
    @Override
    public SwlDTO searchBySoftwareName(String name) {
        log.info("get cpe from sw collection");
        Swl findByswName = this.swlRepository.findByswName(name);
        log.info("Find cpe2.3 from sw collection  : {}", findByswName);        
        SwlDTO swlToSwlDto = swlMapper.swlToSwlDto(findByswName);
        return swlToSwlDto;
    }
      

}
