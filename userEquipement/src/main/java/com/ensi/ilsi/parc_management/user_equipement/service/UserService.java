
package com.ensi.ilsi.parc_management.user_equipement.service;


import com.ensi.ilsi.parc_management.commons.dto.UserDto;

import com.ensi.ilsi.parc_management.user_equipement.entity.User;
import com.ensi.ilsi.parc_management.user_equipement.repository.UserRepository;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 *
 * @author nouha
 */

@Service

public class UserService {
    
    
    
        
      
    private final Logger log = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
   

    public UserService(UserRepository userRepository)
    {
     this.userRepository=userRepository;

    }

    
     public List<UserDto> findAll() {
          log.debug("Request to get all users");
        return this.userRepository.findAll()
                .stream()
                .map(UserService::mapToDto)
                .collect(Collectors.toList());
        
        
         
     }
     

  
    public UserDto findById(Long id) {
        log.debug("Request to get User : {}", id);
        return this.userRepository.findById(id).map(UserService::mapToDto).orElse(null);
        
        
        
    }
    
    public UserDto create(UserDto userDto){
    log.debug("Request to create User : {}", userDto);

        return mapToDto(this.userRepository.save(
                new User(userDto.getName(),
                        userDto.getEmail(),
                        userDto.getPhone(),
                        Collections.emptySet()
                        
                )));
     
    }

    public void delete(Long id) {
        log.debug("Request to delete User : {}", id);
        this.userRepository.deleteById(id);
    }
    
    
    
      public static UserDto mapToDto(User user) {
        if (user != null) {
            return new UserDto(
                    user.getId(),
                   user.getName(),
                   user.getEmail(),
                    user.getPhone() ,
                    user.getEquipements().stream().map(EquipementService::mapToDto).collect(Collectors.toSet()) ) ;
              
                    

        }
        return null;
        

}
}
      




