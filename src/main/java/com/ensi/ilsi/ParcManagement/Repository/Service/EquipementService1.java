/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Repository.Service;

import com.ensi.ilsi.ParcManagement.Web.EquipementRessource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensi.ilsi.ParcManagement.Repository.EquipementRepository;
import com.ensi.ilsi.ParcManagement.Repository.OfficeRepository;
import com.ensi.ilsi.ParcManagement.Repository.UserRepository;
import com.ensi.ilsi.ParcManagement.Web.Dto.EquipementDto;
import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ahmed
 */
@Service
@Transactional
public class EquipementService1 {
    private final Logger log= LoggerFactory.getLogger(EquipementService1.class);
    
    private final EquipementRepository equipementRepository ;
    private final UserRepository userRepository;
    private final OfficeRepository officeRepository;

    public EquipementService1(EquipementRepository equipementRepository, UserRepository userRepository, OfficeRepository officeRepository) {
        this.equipementRepository = equipementRepository;
        this.userRepository = userRepository;
        this.officeRepository = officeRepository;
    }
    
    
    public List<EquipementDto> findAll() {

        return this.equipementRepository.findAll()
                .stream()
                .map(EquipementService1::mapToDto)    // maping from Entity cart to Dto cart  object 
                .collect(Collectors.toList());  // return list of Dto EquipmentService recived 
    }

  

    public EquipementDto create(Long equipmentId) {
        
            Order order = this.orderService.create(cart);
            cart.setOrder(order);

            return mapToDto(this.equipementRepository.save(cart));
        } else {
            throw new IllegalStateException("There is already an active cart");
        }
    

    @Transactional(readOnly = true)
    public EquipementDto findById(Long id) {
        log.debug("Request to get Cart : {}", id);
        return this.equipementRepository.findById(id).map(EquipmentService::mapToDto).orElse(null);
    }

    public void delete(Long id) {
        log.debug("Request to delete Cart : {}", id);
        Cart cart = this.equipementRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Cannot find cart with id " + id));

        cart.setStatus(EquipementStatus.CANCELED);

        this.equipementRepository.save(cart);
    }

    public EquipementDto getActiveCart(Long customerId) {
        List<Cart> carts = this.equipementRepository
                .findByStatusAndCustomerId(EquipementStatus.NEW, customerId);
        if (carts != null) {

            if (carts.size() == 1) {
                return mapToDto(carts.get(0));
            }
            if (carts.size() > 1) {
                throw new IllegalStateException("Many active carts detected !!!");
            }
        }

        return null;
    }

    public static EquipementDto mapToDto(Cart cart) {
        if (cart != null) {
            return new EquipementDto(
                    cart.getId(),
                    cart.getOrder().getId(),
                    CustomerService.mapToDto(cart.getCustomer()),
                    cart.getStatus().name()
            );
        }
        return null;
    }

    
    
    /*
    public List<Equipement> findall(){
        
        return this.equipementRepository.findAll();
                
    

    }
    public Equipement getEquipement(Long equipementID){
        List<Equipement> equipements= this.equipementRepository.findByIdIgnoreCase(equipementID);
        
           List<Cart> carts = this.equipementRepository
                .findByStatusAndCustomerId(EquipementStatus.NEW, customerId);
        if (equipements != null) {

            if (equipements.size() == 1) {
                return ;
            }
            if (carts.size() > 1) {
                throw new IllegalStateException("Many active carts detected !!!");
            }
        }

        return null;
    }*/
    
    public void setEquipement(Equipement e ){
        this.equipementRepository.save(e);
    }
    
    
    
    
    /*
    
     public static EquipementDto mapToDto(Equipement equipement) {
        if (equipement != null) {
            
          return new EquipementDto(equipement.getId(),
        equipement.getName(),
        equipement.getStatus(),
        equipement.getInterventions(),
        equipement.getOffice().getId(),
        equipement.getUser().getRegNumSt() ) ;
        }
        return null;
    }
    */
/*
    public static EquipementDto mapToDto(Equipement equipement) {
        if (equipement != null) {
            
          return new EquipementDto(equipement.getId(),
        equipement.getName(),
        equipement.getStatus(),
        equipement.getInterventions()stream().map(InterventionService::mapToDto).collect(Collectors.toSet(),
         equipement.getOffice().getId() ) ;
          
        }
        return null;
    }*/
}
