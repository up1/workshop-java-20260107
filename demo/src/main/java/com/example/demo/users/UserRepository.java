package com.example.demo.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<MyUser, Integer> {

    // Customize query
    @Query("select id, name from MyUser where id=:userId")
    Optional<MyUser> getById(int userId);
}
