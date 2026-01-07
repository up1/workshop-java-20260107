package org.example;

import java.util.Random;

public class GeneratorID {
    private IRandom random = new RandomV2();

    public GeneratorID(IRandom random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ"+ number;
        return id;
    }

}
