/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import java.util.Set;
import javax.persistence.OneToMany;

/**
 *
 * @author ahmed
 */
public class IntervenantDto {
    
    private Long RegNumInt;
    private String name;
    private String Email;
    private Long Phone;
    


    
    public IntervenantDto() {
    }

    public IntervenantDto(Long RegNumInt, String name, String Email, Long Phone) {
        this.RegNumInt = RegNumInt;
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        
    }
    
    
    

    public Long getRegNumInt() {
        return RegNumInt;
    }

    public void setRegNumInt(Long RegNumInt) {
        this.RegNumInt = RegNumInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

  
    
    
}
