/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web.Dto;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import com.ensi.ilsi.ParcManagement.Entity.Intervenant;
import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author ahmed
 */
public class InterventionDto {
    
    private Long numIntervention;
    private String panne;
    private Date date;  
    
    
    private EquipementDto equipementID ;
    
    
    private IntervenantDto intervenantID ;

    public InterventionDto() {
    }

    public InterventionDto(Long numIntervention, String panne, Date date, EquipementDto equipementID, IntervenantDto intervenantID) {
        this.numIntervention = numIntervention;
        this.panne = panne;
        this.date = date;
        this.equipementID = equipementID;
        this.intervenantID = intervenantID;
    }

    public Long getNumIntervention() {
        return numIntervention;
    }

    public void setNumIntervention(Long numIntervention) {
        this.numIntervention = numIntervention;
    }

    public String getPanne() {
        return panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EquipementDto getEquipementID() {
        return equipementID;
    }

    public void setEquipementID(EquipementDto equipementID) {
        this.equipementID = equipementID;
    }

    public IntervenantDto getIntervenantID() {
        return intervenantID;
    }

    public void setIntervenantID(IntervenantDto intervenantID) {
        this.intervenantID = intervenantID;
    }
    
}
