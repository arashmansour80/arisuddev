/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.impl;

import com.querydsl.core.types.dsl.BooleanExpression;
import it.esc2.earlyWarning.domain.Cpe;
import it.esc2.earlyWarning.domain.QCpe;
import it.esc2.earlyWarning.repository.CpeRepository;
import it.esc2.earlyWarning.service.CpeService;
import it.esc2.earlyWarning.service.dto.CpeDTO;
import it.esc2.earlyWarning.service.mapper.CpeMapper;
import java.util.List;
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
public class CpeServiceImpl implements CpeService {

    private final Logger log = LoggerFactory.getLogger(CpeServiceImpl.class);

    private CpeRepository cpeRepository;
    private CpeMapper cpeMapper;

    public CpeServiceImpl(CpeRepository cpeRepository, CpeMapper cpeMapper) {
        this.cpeRepository = cpeRepository;
        this.cpeMapper = cpeMapper;
    }

    @Override
    public CpeDTO searchByCpe23(String name) {
        log.info("get cpe  from cpe collection by passing cpe name v2.3 with the cpe name :"+ name);
        CpeDTO cpeDto = null;
        QCpe qCpe = new QCpe("cpe");
        BooleanExpression be = qCpe.cpe23Cpe23Item.name.eq(name);
        List<Cpe> filterList = (List<Cpe>) this.cpeRepository.findAll(be);
        if (filterList != null && filterList.size() > 1) {
            log.warn("there is more than one report on cpe filtered : the size of list is : " + filterList.size());
        } else if (filterList != null && !filterList.isEmpty()) {
            log.info("I have found one report on cpe filtered : the size of list is : " + filterList.size());
            log.info("Result of Cpe ==>  : {}", filterList.get(0));
            
            cpeDto = this.cpeMapper.cpeToCpeDto(filterList.get(0));
        } else {
             log.info("I don't have found CPE name with this parameter:" + name);
        }       
        return cpeDto;
    }

}
