package com.java.demo;

public class StringFormat {

    public static void main(String[] args) {

        String url = "https://mkyong.com/spring/%s/";

        String formattedUrl = String.format(url, "spring-profiles-example");

        System.out.println(formattedUrl);

        StringFormat s = new StringFormat();


    }




}
