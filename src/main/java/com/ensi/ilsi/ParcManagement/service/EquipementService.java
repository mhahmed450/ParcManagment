/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensi.ilsi.ParcManagement.repository.EquipementRepository;


import com.ensi.ilsi.ParcManagement.entity.Equipement;
import com.ensi.ilsi.ParcManagement.web.dto.EquipementDto;

import java.util.List;
import java.util.Optional;



/**
 *
 * @author ahmed
 */
@Service

public class EquipementService {

    /* public static EquipementDto mapToDto(Equipement equipement) {
        if (equipement != null) {
            return new EquipementDto(
                    equipement.getId(),
                    equipement.getOrder().getId(),
                    CustomerService.mapToDto(cart.getCustomer()),
                    cart.getStatus().name()
            );
        }
        return null;
    }*/

    
    private final EquipementRepository equipementRepository ;
  

    public EquipementService(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
       
    }

    
     public List<Equipement> findAll() {
         return equipementRepository.findAll();
         
     }
     

    
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

