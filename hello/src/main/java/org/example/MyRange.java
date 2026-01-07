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

    public String getResult() {
        int start = getStart();
        int end = 5;
        String result = "";
        for (int i = start; i <= end ; i++) {
            result += i;
        }
        return result;
    }
}
