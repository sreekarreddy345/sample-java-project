package com.java.designpattern.builderdesignpattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setProcessor("Intel").getPhone();
        System.out.println(p);
    }

}
