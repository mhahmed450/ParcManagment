/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import com.ensi.ilsi.ParcManagement.Entity.Service;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class OfficeDto {
    
    private Long OfficeNumber;
    private String name;
    
    
    private Set<Long> equipementsId;
    
    
    private Service service ;

    public OfficeDto() {
    }

    

    public OfficeDto(Long OfficeNumber, String name, Set<Long> equipementsId, Service service) {
        this.OfficeNumber = OfficeNumber;
        this.name = name;
        this.equipementsId = equipementsId;
        this.service = service;
    }
    
    
    

    public Long getOfficeNumber() {
        return OfficeNumber;
    }

    public void setOfficeNumber(Long OfficeNumber) {
        this.OfficeNumber = OfficeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getEquipementsId() {
        return equipementsId;
    }

    public void setEquipements(Set<Long> equipementsId) {
        this.equipementsId = equipementsId;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    
    
    
}
