package com.java.utils;

public class Sample {
    public static void main(String[] args) {
        Super s = new SubClass();
        s.foo();
    }
}

class Super {
    void foo() {
        System.out.println("Super");
    }
}

class SubClass extends Super {

    void foo() {
        System.out.println("Subclass");
    }
}