
package com.ensi.ilsi.parc_management.user_equipement.repository;


import com.ensi.ilsi.parc_management.user_equipement.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository
public interface UserRepository extends JpaRepository <User,Long> {
    
    @Override
    Optional<User> findById(Long id);
    
    
}
