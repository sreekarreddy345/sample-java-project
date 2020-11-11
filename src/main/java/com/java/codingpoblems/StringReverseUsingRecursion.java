package com.java.codingpoblems;

public class StringReverseUsingRecursion {
    public static void main(String[] args) {


        String str = "Geeks for Geeks";
        getStringReverseUsingRecursion(str);
    }

    static void getStringReverseUsingRecursion(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            getStringReverseUsingRecursion(str.substring(0, str.length() - 1));
        }
    }

}
