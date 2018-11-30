/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.serviceOffice.repository;


import com.ensi.ilsi.ParcManagement.serviceOffice.entity.Service;
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
