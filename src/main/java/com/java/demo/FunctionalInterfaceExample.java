package com.java.demo;

@FunctionalInterface
interface Functional {
    static void getWork() {

    }

    public void doWork();

    default void test() {

    }

}

public class FunctionalInterfaceExample implements Functional {
    public static void main(String[] args) {

        Functional.getWork();
        FunctionalInterfaceExample f = new FunctionalInterfaceExample();
        f.test();// calling default methods in interface

    }

    @Override
    public void doWork() {

    }
}
