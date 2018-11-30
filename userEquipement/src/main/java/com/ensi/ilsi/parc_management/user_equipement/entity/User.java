
package com.ensi.ilsi.parc_management.user_equipement.entity;


import java.io.Serializable;
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
public class User implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Long phone;
    
    @OneToMany
    private Set<Equipement> equipements;

    public User() {
        //User
        
    }

    public User(String name, String email, Long phone, Set<Equipement> equipements) {
        
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.equipements = equipements;
    }

    

    public Set<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Set<Equipement> equipements) {
        this.equipements = equipements;
    }

    public Long getId() {
        return id;
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

    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.email);
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
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stuff{" + "name=" + name + ", Email=" + email + ", Phone=" + phone + '}';
    }
    
}
