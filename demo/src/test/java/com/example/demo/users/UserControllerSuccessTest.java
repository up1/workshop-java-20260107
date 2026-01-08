package com.example.demo.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerSuccessTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("Success with get user by id=1")
    void case01() {
        UserResponse result =restTemplate.getForObject("/user/1", UserResponse.class);
        assertEquals(1, result.id());
        assertEquals("Somkiat", result.name());
    }
}