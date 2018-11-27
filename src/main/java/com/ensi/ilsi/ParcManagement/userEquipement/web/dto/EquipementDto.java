/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.web.dto;

import com.ensi.ilsi.ParcManagement.intervention.entity.Intervention;
import com.ensi.ilsi.ParcManagement.serviceOffice.entity.Office;
import com.ensi.ilsi.ParcManagement.userEquipement.entity.User;
import com.ensi.ilsi.ParcManagement.intervention.web.dto.InterventionDto;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class EquipementDto {
    
    private Long id;
    private String name;
    private String status;
    private Set<InterventionDto> interventionsDto ;  
    
  
    

    public EquipementDto(Long id, String name, String status, Set<InterventionDto> interventionsDto) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.interventionsDto= interventionsDto;
     
      
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

    public Set<InterventionDto> getInterventionsDto() {
        return interventionsDto;
    }

    public void setInterventionsDto(Set<InterventionDto> interventionsDto) {
        this.interventionsDto = interventionsDto;
    }

   
    

   
    
    

    
    
}
