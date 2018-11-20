/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Service;

import com.ensi.ilsi.ParcManagement.Entity.Intervention;

import com.ensi.ilsi.ParcManagement.Repository.InterventionRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nouha
 */
@Service
@Transactional
public class InterventionService {
        
    private final InterventionRepository interventionRepository;

    public InterventionService(InterventionRepository interventionRepository)
    {
     this.interventionRepository=interventionRepository;
    }

    
     public List<Intervention> findAll() {
         return interventionRepository.findAll();
         
     }
     

    @Transactional(readOnly = true)
    public Optional<Intervention> findById(Long id) {
        return this.interventionRepository.findById(id);
    }
    
    @Transactional(readOnly = true)
    public Optional<Intervention> findByDate(Date date) {
        return this.interventionRepository.findByDate(date);
    }
    
    @Transactional(readOnly = true)
    public Optional<Intervention> findByPanne(String panne) {
        return this.interventionRepository.findByPanne(panne);
    }
    
    public Intervention create(Intervention intervention){
    
        return  this.interventionRepository.save(intervention);
    }

    public void delete(Long id) {
        
        this.interventionRepository.deleteById(id);
    }

       

}
