package com.example.demo.users;

public class UserNotFoundException extends RuntimeException {
    private int userId = 0;
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(int userId) {
        this.userId = userId;
    }
}
