package org.example;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "somkiat");
        Employee e2 = new Employee(1, "somkiat");

        System.out.println(e1);
        System.out.println(e2);

        if(e1.equals(e2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
