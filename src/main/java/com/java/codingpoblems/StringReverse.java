package com.java.codingpoblems;

public class StringReverse {

    public static void main(String[] args) {
        String Str = "Hello World";

        System.out.println("Using String Builder - " + stringReverseStringBuilder(Str));
//        System.out.println(stringReverseManually(Str));
        System.out.println("Using loop - " + stringReverseUsingLoop(Str));


    }

    private static String stringReverseUsingLoop(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }


    private static String stringReverseStringBuilder(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }


}
