/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.web;


import com.ensi.ilsi.ParcManagement.commons.dto.UserDto;

import com.ensi.ilsi.ParcManagement.userEquipement.service.UserService;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samar
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/API/users")
public class UserRessource {
      private final UserService userService;

    public UserRessource(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public List<UserDto> findAll(){
        return this.userService.findAll();   }
    
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") Long  id){
        return this.userService.findById(id);
    }
    
    @PostMapping("/{user}")
    public UserDto addUser(@RequestBody UserDto userDto){
        return this.userService.create(userDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
        
    }
    
    
}
