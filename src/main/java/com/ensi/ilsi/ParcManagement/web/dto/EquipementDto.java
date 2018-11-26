/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import com.ensi.ilsi.ParcManagement.Entity.Office;
import com.ensi.ilsi.ParcManagement.Entity.User;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class EquipementDto {
    
    private Long Id;
    private String name;
    private String status;
    private Set<Long> interventionsId ;  
    
  
    

    public EquipementDto(Long Id, String name, String status, Set<Long> interventionsId) {
        this.Id = Id;
        this.name = name;
        this.status = status;
        this.interventionsId = interventionsId;
     
      
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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
