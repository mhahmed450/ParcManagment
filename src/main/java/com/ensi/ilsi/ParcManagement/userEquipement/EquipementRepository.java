/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement;

import com.ensi.ilsi.ParcManagement.userEquipement.Equipement;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface EquipementRepository extends JpaRepository <Equipement,Long> {
    Optional<Equipement> findById(Long id);

}