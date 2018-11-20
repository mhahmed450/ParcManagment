/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Entity;

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
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String Email;
    private Long Phone;
    
    @OneToMany
    private Set<Equipement> equipements;

    public User() {
        //User
    }

    public User(String name, String Email, Long Phone, Set<Equipement> equipements) {
        
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        this.equipements = equipements;
    }

    

    public Set<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Set<Equipement> equipements) {
        this.equipements = equipements;
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

    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Email);
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
        final User other = (User) obj;
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stuff{" + "name=" + name + ", Email=" + Email + ", Phone=" + Phone + '}';
    }
    
}
