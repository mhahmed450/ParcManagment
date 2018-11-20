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
    
 
    private Set<OfficeDto> offices;

    public ServiceDto() {
    }

    public ServiceDto(Long ServiceNumber, String name, Set<OfficeDto> offices) {
        this.ServiceNumber = ServiceNumber;
        this.name = name;
        this.offices = offices;
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

    public Set<OfficeDto> getOffices() {
        return offices;
    }

    public void setOffices(Set<OfficeDto> offices) {
        this.offices = offices;
    }
    
    
    
    
}
