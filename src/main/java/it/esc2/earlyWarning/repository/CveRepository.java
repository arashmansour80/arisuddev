/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.repository;

import it.esc2.earlyWarning.domain.Cve;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a.mansour
 */
//@SuppressWarnings("unused")
@Repository
public interface CveRepository extends MongoRepository<Cve, String> {

//    public List<Cve> findBylastModifiedDate(String date);
//
//    // @Query(value = "{'configuration':?0}")
//    //  public List<Cve> findByConfiguration(Object conf);// todo chane object to real object
//    @Query(value = "{'cve.cVE_data_meta.iD':?0}")// should be change 
//    public Cve findByIdCve(String id);

}