/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.repository;

import it.esc2.earlyWarning.domain.Cve;
import it.esc2.earlyWarning.domain.Swl;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a.mansour
 */
@Repository
public interface SwlRepository extends MongoRepository<Swl, String>{
    
    public Swl findByswName(String swName);
    
}
