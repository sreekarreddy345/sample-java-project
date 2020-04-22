package com.java.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    public void perform();

    default void another() {
        System.out.println(" This is another method ");
    }

}
