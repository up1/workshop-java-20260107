package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse get(int userId) {

        Optional<MyUser> result = userRepository.getById(userId);
        if(result.isEmpty()){
            // Not found
            throw new UserNotFoundException("Not found");
        }
        // Found


        if(userId == 2) {
            throw new UserNotFoundException("User id=" +  userId + " not found in system");
        }
        return new UserResponse(1, "Somkiat");
    }

}
