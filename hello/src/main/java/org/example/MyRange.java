package org.example;

public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return input.startsWith("[");
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return input.charAt(1) - 48;
        }
        return input.charAt(1) - 48 + 1;
    }
}
