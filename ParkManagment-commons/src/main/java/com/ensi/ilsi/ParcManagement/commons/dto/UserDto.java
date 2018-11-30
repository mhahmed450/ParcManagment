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
public class UserDto {
    
    private Long regNumSt;
    private String name;
    private String email;
    private Long phone;
   
    
    private Set<EquipementDto>equipementsDto;
    
    

    public UserDto() {
        //
    }
    

    public UserDto(Long regNumSt, String name, String email, Long phone, Set<EquipementDto> equipementsDto) {
        this.regNumSt = regNumSt;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.equipementsDto = equipementsDto;
    }
    
    
    

    public Long getRegNumSt() {
        return regNumSt;
    }

    public void setRegNumSt(Long regNumSt) {
        this.regNumSt = regNumSt;
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

    public Set<EquipementDto> getEquipementsDto() {
        return equipementsDto;
    }

    public void setEquipements(Set<EquipementDto> equipementsDto) {
        this.equipementsDto = equipementsDto;
    }
    
    
    
    
    
}
