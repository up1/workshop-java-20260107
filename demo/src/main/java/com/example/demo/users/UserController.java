package com.example.demo.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable int id){
        if(id == 2) {
            throw new UserNotFoundException("User id=" +  id + " not found in system");
        }
        return new UserResponse(1, "Somkiat");
    }

}
