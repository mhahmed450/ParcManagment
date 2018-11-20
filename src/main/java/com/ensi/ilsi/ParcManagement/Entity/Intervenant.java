/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Entity;

import com.ensi.ilsi.ParcManagement.*;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ahmed
 */
 @Entity
public class Intervenant  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Email;
    private Long Phone;
    
    @OneToMany
    private Set<Intervention> intervensions ;
    
    
    public Intervenant() {
        //Intervenant
    }
    

    public Intervenant( String name, String Email, Long Phone, Set<Intervention> intervensions) {
       
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        this.intervensions = intervensions;
    }

    
    public Set<Intervention> getIntervensions() {
        return intervensions;
    }

    public void setIntervensions(Set<Intervention> intervensions) {
        this.intervensions = intervensions;
    }
    
    

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

   

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(Long Phone) {
        this.Phone = Phone;
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

    public Intervenant(String name, String Email, Long Phone) {
       
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
    }

    
    
}
