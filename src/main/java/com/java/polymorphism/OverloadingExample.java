package com.java.polymorphism;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class OverloadingExample {

    public static void main(String[] args) {
        System.out.println(getRandomString());
        System.out.println(getRandomString(1));
        dateExample();
    }


    public static String getRandomString() {
        UUID random = UUID.randomUUID();
        return "THB".concat(random.toString().replaceAll("-", ""));
    }

    public static int getRandomString(int count) {
        return count;
    }

    public static void dateExample() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println("formatted date = " + format);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println("formatted date = " + timeStamp);
    }

}
