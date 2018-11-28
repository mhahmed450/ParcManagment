/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.commons.dto;


import java.util.Set;



/**
 *
 * @author ahmed
 */
public class OfficeDto {
    
    private Long officeNumber;
    private String name;
    
    
    private Set<Long> equipementsId;

    public OfficeDto(String name, Set<Long> equipementsId) {
        this.name = name;
        this.equipementsId = equipementsId;
    }
    
    
   

    public OfficeDto() {
    }

    public Set<Long> getEquipementsId() {
        return equipementsId;
    }

    public void setEquipementsId(Set<Long> equipementsId) {
        this.equipementsId = equipementsId;
    }

   
    

  
    
    

    public Long getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Long officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
}
