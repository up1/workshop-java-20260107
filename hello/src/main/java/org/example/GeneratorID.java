package org.example;

import java.util.Random;

public class GeneratorID {
    private Random random = new Random();

    public GeneratorID(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ"+ number;
        return id;
    }

}
