/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.repository;


import com.ensi.ilsi.ParcManagement.userEquipement.entity.User;
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
