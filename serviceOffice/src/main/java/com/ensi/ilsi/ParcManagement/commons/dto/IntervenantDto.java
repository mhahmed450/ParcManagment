/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.commons.dto;



/**
 *
 * @author ahmed
 */
public class IntervenantDto {
    
    private Long regNumInt;
    private String name;
    private String email;
    private Long phone;
    


    
    public IntervenantDto() {
    }

    public IntervenantDto(Long regNumInt, String name, String email, Long phone) {
        this.regNumInt = regNumInt;
        this.name = name;
        this.email = email;
        this.phone = phone;
        
    }
    
    
    

    public Long getRegNumInt() {
        return regNumInt;
    }

    public void setRegNumInt(Long regNumInt) {
        this.regNumInt = regNumInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

  
    
    
}
