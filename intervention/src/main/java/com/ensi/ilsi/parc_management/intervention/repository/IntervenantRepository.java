
package com.ensi.ilsi.parc_management.intervention.repository;

import com.ensi.ilsi.parc_management.intervention.entity.Intervenant;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 
 */
@Repository
public interface IntervenantRepository extends JpaRepository <Intervenant,Long> {
    
    @Override
    Optional<Intervenant> findById(Long id);
    
    
    
    
}
