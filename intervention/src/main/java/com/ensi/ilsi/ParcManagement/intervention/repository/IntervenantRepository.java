/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.intervention.repository;

import com.ensi.ilsi.ParcManagement.intervention.entity.Intervenant;

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
