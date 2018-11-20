/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Repository.Service;

import com.ensi.ilsi.ParcManagement.Web.EquipementRessource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensi.ilsi.ParcManagement.Repository.EquipementRepository;
import com.ensi.ilsi.ParcManagement.Repository.OfficeRepository;
import com.ensi.ilsi.ParcManagement.Repository.UserRepository;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import com.ensiILSI.ParcManagement.Entity.Equipment;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 *
 * @author ahmed
 */
@Service
@Transactional
public class EquipementService {
    private final Logger log= LoggerFactory.getLogger(EquipementService.class);
    
    private final EquipementRepository equipementRepository ;
    private final UserRepository userRepository;
    private final OfficeRepository officeRepository;

    public EquipementService(EquipementRepository equipementRepository, UserRepository userRepository, OfficeRepository officeRepository) {
        this.equipementRepository = equipementRepository;
        this.userRepository = userRepository;
        this.officeRepository = officeRepository;
    }

    
     public List<Equipement> findAll() {
         return equipementRepository.findAll();
         
     }
     

    @Transactional(readOnly = true)
    public Equipement findById(Long id) {
        
       
       
        return this.equipementRepository.findByIdIgnoreCase(id);
        
    }
    
     
    
   

    public Equipement create(Equipement equipement){
    
        return  this.equipementRepository.save(
                new Equipement(
                        equipement.getId(),
                        equipement.getName(),
                        equipement.getStatus(),
                        equipement.getInterventions()
                )
        );
    }

    public void delete(Long id) {
        
        this.equipementRepository.deleteById(id);
    }

   
     }

