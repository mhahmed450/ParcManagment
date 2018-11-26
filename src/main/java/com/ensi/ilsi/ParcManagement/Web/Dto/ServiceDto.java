/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Office;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class ServiceDto {
    
    
    private Long ServiceNumber;
    private String name;
    
 
    private Set<Long> officesId;

    public ServiceDto() {
    }

    public ServiceDto(Long ServiceNumber, String name, Set<Long> officesId) {
        this.ServiceNumber = ServiceNumber;
        this.name = name;
        this.officesId = officesId;
    }

    
    
    public Long getServiceNumber() {
        return ServiceNumber;
    }

    public void setServiceNumber(Long ServiceNumber) {
        this.ServiceNumber = ServiceNumber;
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
