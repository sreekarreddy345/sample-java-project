package com.java.demo;

// Java program implementing SingletonExplanation class
// with getInstance() method
class SingletonExplanation {
    // static variable single_instance of type SingletonExplanation
    private static SingletonExplanation single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private SingletonExplanation() {
        s = "Hello I am a codingpoblems part of SingletonExplanation class";
    }

    // static method to create instance of SingletonExplanation class
    public static SingletonExplanation getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonExplanation();
        }
        return single_instance;
    }
}

// Driver Class
class SingletonExplantion {
    public static void main(String args[]) {
        // instantiating SingletonExplanation class with variable x
        SingletonExplanation x = SingletonExplanation.getInstance();
        System.out.println("x hashcode value - " + x.hashCode());
        // instantiating SingletonExplanation class with variable y
        SingletonExplanation y = SingletonExplanation.getInstance();
        System.out.println("Y hashcode value - " + y.hashCode());
        // instantiating SingletonExplanation class with variable z
        SingletonExplanation z = SingletonExplanation.getInstance();
        System.out.println("z hashcode value - " + z.hashCode());
        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

