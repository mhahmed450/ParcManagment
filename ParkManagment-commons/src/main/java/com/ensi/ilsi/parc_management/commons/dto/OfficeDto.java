
package com.ensi.ilsi.parc_management.commons.dto;






/**
 *
 * @author ahmed
 */
public class OfficeDto {
    
    private Long officeNumber;
    private String name;

    public OfficeDto(String name, Long officeNumber) {
        this.name = name;
        this.officeNumber = officeNumber;
    }


    public OfficeDto() {
        //
    }


    public Long getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Long officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
}


