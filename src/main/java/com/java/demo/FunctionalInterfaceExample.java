package com.java.demo;

@FunctionalInterface
interface Functional {
    public void doWork();

    public boolean equals(Object obj);

    public String toString();

    default void test() {

    }

}

public class FunctionalInterfaceExample implements Functional {
    public static void main(String[] args) {

    }

    @Override
    public void doWork() {

    }
}
