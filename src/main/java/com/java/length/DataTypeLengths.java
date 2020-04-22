package com.java.length;

import java.util.Arrays;

public class DataTypeLengths {
    public static void main(String[] args) {
        String a = "asdadsada";
        String b[] = {"w", "w", "d", "h", "e"};

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));

        System.out.println("String length - " + a.length());
        System.out.println("Array Length - " + a.toCharArray().length);
        System.out.println("Array Length of b - " + b.length);
        System.out.println("List Size - " + Arrays.asList(a.toCharArray()).size());
    }

}
