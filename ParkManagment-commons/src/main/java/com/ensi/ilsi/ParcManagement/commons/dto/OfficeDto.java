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

    public OfficeDto(String name, Long officeNumber) {
        this.name = name;
        this.officeNumber = officeNumber;
    }


    public OfficeDto() {
        //
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


