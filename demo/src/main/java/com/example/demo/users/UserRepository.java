package com.example.demo.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository
        extends JpaRepository<MyUser, Integer> {

    // https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html
    Optional<List<MyUser>> findByName(String name);


    // Customize query
    @Query("select id, name from MyUser where id=:userId")
    Optional<MyUser> getById(int userId);
}
