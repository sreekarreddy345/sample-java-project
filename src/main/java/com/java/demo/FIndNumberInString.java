package com.java.demo;

public class FIndNumberInString {
    public static void main(String[] args) {
        String a = "rfc6vhjvghj";
        char[] ch = a.toCharArray();

        for (char c : ch) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}
