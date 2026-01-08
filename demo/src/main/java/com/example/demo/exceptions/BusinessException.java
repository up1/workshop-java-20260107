package com.example.demo.exceptions;

public class BusinessException extends RuntimeException {
    private int code;
    private String message;

    public BusinessException() {
        this(0, "");
    }

    public BusinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
