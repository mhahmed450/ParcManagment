
package com.ensi.ilsi.parc_management.intervention.repository;


import com.ensi.ilsi.parc_management.intervention.entity.Intervention;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository
public interface InterventionRepository extends JpaRepository <Intervention,Long> {
   @Override
   Optional<Intervention> findById(Long id);
     
         Optional<Intervention> findByDate(Date d);
    
         Optional<Intervention> findByPanne(String panne);
    
 
    
}
