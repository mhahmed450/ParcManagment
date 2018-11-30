
package com.ensi.ilsi.parc_management.service_office.repository;


import com.ensi.ilsi.parc_management.service_office.entity.Office;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository
public interface OfficeRepository extends JpaRepository <Office,Long> {
    
    
    @Override
    Optional<Office> findById(Long id);
    
}
