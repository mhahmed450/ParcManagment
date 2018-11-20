/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Repository;

import com.ensi.ilsi.ParcManagement.Entity.Intervenant;
import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import com.ensi.ilsi.ParcManagement.Entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface OfficeRepository extends JpaRepository <Office,Long> {
    //Office findByOfficeNumberOffice(int id) ;
    
}
