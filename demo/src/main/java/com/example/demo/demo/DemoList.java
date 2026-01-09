package com.example.demo.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("2ffff");
        names.add("pui");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.stream().count());
        System.out.println(names.stream()
                .filter(s -> s.equals("pui"))
                .count());
    }
}
