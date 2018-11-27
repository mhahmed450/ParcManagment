/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web.dto;

import com.ensi.ilsi.ParcManagement.entity.Equipement;
import com.ensi.ilsi.ParcManagement.entity.Service;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class OfficeDto {
    
    private Long officeNumber;
    private String name;
    
    
    private Set<EquipementDto> equipementsDto;

    public OfficeDto(String name, Set<EquipementDto> equipementsDto) {
        this.name = name;
        this.equipementsDto = equipementsDto;
    }
    
    
   

    public OfficeDto() {
    }

    public Set<EquipementDto> getEquipementsDto() {
        return equipementsDto;
    }

    public void setEquipementsDto(Set<EquipementDto> equipementsDto) {
        this.equipementsDto = equipementsDto;
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
