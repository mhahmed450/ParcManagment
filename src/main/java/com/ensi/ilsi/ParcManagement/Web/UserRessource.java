/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web;


import com.ensi.ilsi.ParcManagement.Entity.User;
import com.ensi.ilsi.ParcManagement.Service.UserService;
import java.util.List;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nouha
 */
@RestController
@RequestMapping("/API/user")
public class UserRessource {
      private final UserService userService;

    public UserRessource(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public List<User> findAll(){
        return this.userService.findAll();   }
    
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Long  id){
        return this.userService.findById(id);
    }
    
    @PostMapping("/{user}")
    public User addUser(@RequestBody User user){
        return this.userService.create(user);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
        
    }
    
    
}
