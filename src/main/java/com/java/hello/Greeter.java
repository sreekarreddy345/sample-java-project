package com.java.hello;

public class Greeter {
    public static String sayHello() {
        String sample = sample();
        return "Hello world! How are you " + sample;
    }

    private static String sample() {
        return "Sreekar";
    }

}
