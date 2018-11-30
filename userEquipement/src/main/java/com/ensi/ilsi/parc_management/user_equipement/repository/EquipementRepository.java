
package com.ensi.ilsi.parc_management.user_equipement.repository;

import com.ensi.ilsi.parc_management.user_equipement.entity.Equipement;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository
public interface EquipementRepository extends JpaRepository <Equipement,Long> {
    
    @Override
    Optional<Equipement> findById(Long id);

}