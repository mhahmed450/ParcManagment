/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.intervention.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Ahmed
 */
@Entity
public class Intervention implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numIntervention;
    private String panne;
    private Date date;  
    
    
    private Long intervenantId ;

    public Intervention() {
        //intervention 
        
    }

    public Intervention( String panne, Date date,Long intervenant) {
        
        this.panne = panne;
        this.date = date;

        this.intervenantId = intervenant;
    }

    

    public Long getIntervenant() {
        return intervenantId;
    }

    public void setIntervenant(Long intervenant) {
        this.intervenantId = intervenant;
    }

   
 public Long getNumIntervention() {
        return numIntervention;
    }

   
    public String getPanne() {
        return panne;
    }

    public Date getDate() {
        return date;
    }

   

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.numIntervention);
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
        final Intervention other = (Intervention) obj;
        if (!Objects.equals(this.numIntervention, other.numIntervention)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Intervention{" + "panne=" + panne + ", date=" + date + '}';
    }
    
}
