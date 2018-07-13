/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.repository;

import it.esc2.earlyWarning.domain.Cve;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a.mansour
 */
//@SuppressWarnings("unused")
@Repository
public interface ICveRepository extends MongoRepository<Cve, String> {

    public List<Cve> findByLastModifiedDate(String date);

   // @Query(value = "{'configuration':?0}")
    public List<Cve> findByConfiguration(Object conf);

}
