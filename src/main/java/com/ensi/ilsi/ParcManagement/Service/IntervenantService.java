/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Service;


import com.ensi.ilsi.ParcManagement.Entity.Intervenant;

import com.ensi.ilsi.ParcManagement.Repository.IntervenantRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ahmed
 */

@Service
@Transactional
public class IntervenantService {
    
    
    private final IntervenantRepository intervenantRepository ;
  

    public IntervenantService(IntervenantRepository intervenantRepository) {
        this.intervenantRepository = intervenantRepository;
       
    }

    
     public List<Intervenant> findAll() {
         return intervenantRepository.findAll();
         
     }
     

    @Transactional(readOnly = true)
    public  Optional<Intervenant> findById(Long id) {
        
       
       
       return this.intervenantRepository.findById(id);
        
    }
    
     
    
   

    public Intervenant create(Intervenant intervenant){
   
        return  this.intervenantRepository.save(intervenant );
        
    }

    public void delete(Long id) {
        
        this.intervenantRepository.deleteById(id);
    }
    
    
}
