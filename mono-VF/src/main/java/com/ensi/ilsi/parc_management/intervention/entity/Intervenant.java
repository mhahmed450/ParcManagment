/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.parc_management.intervention.entity;


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
    private String email;
    private Long phone;
    
   
    
    
    public Intervenant() {
        //Intervenant
    }
    

    public Intervenant( String name, String email, Long phone) {
       
        this.name = name;
        this.email = email;
        this.phone = phone;
        
    }

    public Long getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return "Intervenant{" + "name=" + name + ", Email=" + email + ", Phone=" + phone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.email);
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
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setPhone(Long Phone) {
        this.phone = Phone;
    }

    

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

   

    
    
}
