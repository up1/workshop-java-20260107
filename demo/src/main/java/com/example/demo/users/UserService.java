package com.example.demo.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse get(int userId) {
        if(userId == 2) {
            throw new UserNotFoundException("User id=" +  userId + " not found in system");
        }
        return new UserResponse(1, "Somkiat");
    }

}
