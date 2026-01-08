package com.example.demo.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerFailureTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("User not found with id=2")
    void case01() {
        ResponseEntity<ErrorResponse> result
                = restTemplate.getForEntity("/user/2",ErrorResponse.class);
        assertEquals(404, result.getStatusCode().value());
        assertEquals("User id=2 not found in system", result.getBody().messsage());
    }

    @Test
    @DisplayName("MethodArgumentTypeMismatchException")
    void case02() {
        ResponseEntity<ErrorResponse> result
                = restTemplate.getForEntity("/user/not-number",ErrorResponse.class);
        assertEquals(400, result.getStatusCode().value());
    }
}