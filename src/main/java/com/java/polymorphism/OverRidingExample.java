package com.java.polymorphism;

public class OverRidingExample {

    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.sample();
        childObj.help();//this will call help() in child class if it overrides else it will call the parent class help()
    }
}

abstract class Parent {
    abstract void sample();

    public void help() {
        System.out.println("This is help from parent abstract class");
    }
}

class Child extends Parent {

    @Override
    void sample() {
        System.out.println("This is sample() from child class and I am implementing parent class abstract method");
    }

    @Override
    public void help() {
        System.out.println("This is help from child class and I am overriding parent class method");
    }
}
