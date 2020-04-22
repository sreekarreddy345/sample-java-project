package com.java.equals;

import org.testng.annotations.Test;

public class Example {
@Test
    public void test() {
        String a = "value";
        String b = "value";

        System.out.println("equals -> " + a.equals(b));
        System.out.println("value of  " + (a == b));


        Example example = new Example();
        Example example1 = new Example();

        System.out.println("hashcode - " + example.hashCode());
        System.out.println("hashcode 1 - " + example1.hashCode());
    }
}
