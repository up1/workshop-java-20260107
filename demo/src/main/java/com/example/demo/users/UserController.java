package com.example.demo.users;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable int id){
        // IP Address
        String ipAddress = ThreadContext.get("X-IP-ADDRESS");
        System.out.println("Client's IP Address : " + ipAddress);
        return new UserResponse(1, "Somkiat");
    }

}
