package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyRandom6 extends Random {
    @Override
    public int nextInt(int bound) {
        return 6;
    }
}

class GeneratorIDTest {

    @Test
    void get() {
        Random random = new MyRandom6();
        GeneratorID g = new GeneratorID(random);
        String result = g.get();
        assertEquals("XYZ6", result);
    }
}