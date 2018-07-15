/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.repository;

import it.esc2.earlyWarning.domain.Nvd;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a.mansour
 */
//@SuppressWarnings("unused")
@Repository
public interface NvdRepository extends MongoRepository<Nvd, String> {

    public List<Nvd> findBylastModifiedDate(String date);

   // @Query(value = "{'configuration':?0}")
  //  public List<Nvd> findByConfiguration(Object conf);// todo chane object to real object

}
