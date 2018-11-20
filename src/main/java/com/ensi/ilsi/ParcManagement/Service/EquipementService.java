/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensi.ilsi.ParcManagement.Repository.EquipementRepository;


import com.ensi.ilsi.ParcManagement.Entity.Equipement;

import java.util.List;
import java.util.Optional;



/**
 *
 * @author ahmed
 */
@Service
@Transactional
public class EquipementService {

    
    private final EquipementRepository equipementRepository ;
  

    public EquipementService(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
       
    }

    
     public List<Equipement> findAll() {
         return equipementRepository.findAll();
         
     }
     

    @Transactional(readOnly = true)
    public  Optional<Equipement> findById(Long id) {
        
       
       
       return this.equipementRepository.findById(id);
        
    }
    
     
    
   

    public Equipement create(String name){
    
        return  this.equipementRepository.save(
                new Equipement(
                        
                        name,
                        null,
                        null
                ) );
        
    
    }

    public void delete(Long id) {
        
        this.equipementRepository.deleteById(id);
    }

   
     }

