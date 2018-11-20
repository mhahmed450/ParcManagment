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
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long OfficeNumber;
    private String name;

    public Office() {
    }

    public Office(Long OfficeNumber, String name) {
        this.OfficeNumber = OfficeNumber;
        this.name = name;
    }

    public Long getOfficeNumber() {
        return OfficeNumber;
    }

    public String getName() {
        return name;
    }

    public void setOfficeNumber(Long OfficeNumber) {
        this.OfficeNumber = OfficeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final Office other = (Office) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Office{" + "OfficeNumber=" + OfficeNumber + ", name=" + name + '}';
    }
    
    
}
