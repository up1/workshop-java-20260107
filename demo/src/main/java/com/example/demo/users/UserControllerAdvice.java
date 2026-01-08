package com.example.demo.users;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(exception = UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFound(UserNotFoundException e) {
        return new ResponseEntity<>(
                new ErrorResponse(e.getMessage()),
                HttpStatusCode.valueOf(404));
    }

    @ExceptionHandler(exception = MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> xxxx(Exception e) {
        return new ResponseEntity<>(
                new ErrorResponse(e.getMessage()),
                HttpStatusCode.valueOf(400));
    }

}
