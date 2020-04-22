package com.java.polymorphism;

import java.util.UUID;

public class OverloadingExample {

    public static void main(String[] args) {
        System.out.println(getRandomString());
    }


    public static String getRandomString() {
        UUID random = UUID.randomUUID();
        return "THB".concat(random.toString().replaceAll("-", ""));
    }

    public static String getRandomString(int count) {

        return null;
    }

}
