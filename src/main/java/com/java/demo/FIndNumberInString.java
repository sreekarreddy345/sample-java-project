package com.java.demo;

import java.util.HashMap;
import java.util.Map;

public class FIndNumberInString {
    public static void main(String[] args) {
        String a = "rfc6vhjvghj";
        char[] ch = a.toCharArray();

        Map<String,String> stringStringMap = new HashMap<>();

        for(char c : ch){

            if(Character.isDigit(c)){
                System.out.println(c);
            }

        }
    }
}
