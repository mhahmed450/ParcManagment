/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.service;


import com.ensi.ilsi.ParcManagement.entity.User;

import com.ensi.ilsi.ParcManagement.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nouha
 */

@Service

public class UserService {
        
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
     this.userRepository=userRepository;
    }

    
     public List<User> findAll() {
         return userRepository.findAll();
         
     }
     

  
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
        
    }
    
    public User create(User user){
    
        return  this.userRepository.save(user);
    }

    public void delete(Long id) {
        
        this.userRepository.deleteById(id);
    }

}