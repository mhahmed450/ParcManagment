
package com.ensi.ilsi.parc_management.service_office.repository;


import com.ensi.ilsi.parc_management.service_office.entity.Service;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository
public interface ServiceRepository extends JpaRepository <Service,Long> {
    
    
    @Override
    Optional<Service> findById(Long id);
    
}
