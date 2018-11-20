/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Entity;

import com.ensi.ilsi.ParcManagement.*;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Administrator
 */
 @Entity
public class Intervenant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long RegNumInt;
    private String name;
    private String Email;
    private Long Phone;

    @Override
    public String toString() {
        return "Intervenant{" + "name=" + name + ", Email=" + Email + ", Phone=" + Phone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Intervenant other = (Intervenant) obj;
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return true;
    }

    public void setRegNumInt(Long RegNumInt) {
        this.RegNumInt = RegNumInt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    public Long getRegNumInt() {
        return RegNumInt;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public Long getPhone() {
        return Phone;
    }

    public Intervenant(Long RegNumInt, String name, String Email, Long Phone) {
        this.RegNumInt = RegNumInt;
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
    }

    public Intervenant() {
    }
    
}
