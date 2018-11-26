/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web.dto;

import com.ensi.ilsi.ParcManagement.entity.Intervention;
import com.ensi.ilsi.ParcManagement.entity.Office;
import com.ensi.ilsi.ParcManagement.entity.User;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class EquipementDto {
    
    private Long id;
    private String name;
    private String status;
    private Set<Long> interventionsId ;  
    
  
    

    public EquipementDto(Long id, String name, String status, Set<Long> interventionsId) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.interventionsId = interventionsId;
     
      
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Long> getInterventionsId() {
        return interventionsId;
    }

    public void setInterventionsId(Set<Long> interventionsId) {
        this.interventionsId = interventionsId;
    }

   
    

   
    
    

    
    
}