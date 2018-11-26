/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import java.util.Set;


/**
 *
 * @author ahmed
 */
public class UserDto {
    
    private Long RegNumSt;
    private String name;
    private String Email;
    private Long Phone;
   
    
    private Set<Long> equipementsId;
    
    

    public UserDto() {
    }
    

    public UserDto(Long RegNumSt, String name, String Email, Long Phone, Set<Long> equipementsId) {
        this.RegNumSt = RegNumSt;
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        this.equipementsId = equipementsId;
    }
    
    
    

    public Long getRegNumSt() {
        return RegNumSt;
    }

    public void setRegNumSt(Long RegNumSt) {
        this.RegNumSt = RegNumSt;
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

    public Set<Long> getEquipementsId() {
        return equipementsId;
    }

    public void setEquipements(Set<Long> equipementsId) {
        this.equipementsId = equipementsId;
    }
    
    
    
    
    
}
