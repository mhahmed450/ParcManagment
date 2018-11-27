/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.serviceOffice;

import com.ensi.ilsi.ParcManagement.intervention.Intervenant;
import com.ensi.ilsi.ParcManagement.intervention.Intervention;
import com.ensi.ilsi.ParcManagement.serviceOffice.Office;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface OfficeRepository extends JpaRepository <Office,Long> {
    Optional<Office> findById(Long id) ;
    
}