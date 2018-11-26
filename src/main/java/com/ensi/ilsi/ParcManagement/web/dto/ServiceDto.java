/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web.dto;

import com.ensi.ilsi.ParcManagement.entity.Office;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class ServiceDto {
    
    
    private Long serviceNumber;
    private String name;
    
 
    private Set<Long> officesId;

    public ServiceDto() {
    }

    public ServiceDto(Long serviceNumber, String name, Set<Long> officesId) {
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.officesId = officesId;
    }

    
    
    public Long getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(Long serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getOfficesId() {
        return officesId;
    }

    public void setOfficesId(Set<Long> officesId) {
        this.officesId = officesId;
    }
    
    
    
    
}
