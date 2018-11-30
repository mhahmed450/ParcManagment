/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.parc_management.commons.dto;


import com.ensi.ilsi.parc_management.commons.dto.OfficeDto;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class ServiceDto {
    
    
    private Long serviceNumber;
    private String name;
    
 
    private Set<OfficeDto> officesDto;

    public ServiceDto() {
    }

    public ServiceDto(Long serviceNumber, String name, Set<OfficeDto> officesDto) {
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.officesDto = officesDto;
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

    public Set<OfficeDto> getOfficesDto() {
        return officesDto;
    }

    public void setOfficesId(Set<OfficeDto> officesDto) {
        this.officesDto = officesDto;
    }
    
    
    
    
}
