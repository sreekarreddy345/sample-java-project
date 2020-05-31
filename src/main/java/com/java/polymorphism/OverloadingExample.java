package com.java.polymorphism;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class OverloadingExample {

    public static void main(String[] args) {
        System.out.println(getRandomString());
    }


    public static String getRandomString() {
        UUID random = UUID.randomUUID();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp);
        return "THB".concat(random.toString().replaceAll("-", ""));
    }

    public static String getRandomString(int count) {

        return null;
    }

}
