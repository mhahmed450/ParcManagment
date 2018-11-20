/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Repository;

import com.ensi.ilsi.ParcManagement.Entity.Intervenant;
import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Administrator
 */
public interface IntervenantRepository extends JpaRepository <Intervenant,Long> {
Intervenant findByRegNumInt(int id) ;
    
}
