package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void say() {
        HelloWorld h1 = new HelloWorld();
        String result = h1.say("somkiat");
        assertEquals("Hello somkiat", result);
    }
}