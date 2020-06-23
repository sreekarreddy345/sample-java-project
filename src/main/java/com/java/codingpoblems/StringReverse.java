package com.java.codingpoblems;

public class StringReverse {

    public static void main(String[] args) {
        String Str = "Hello World";

        System.out.println(stringReverseStringBuilder(Str));
//        System.out.println(stringReverseManually(Str));
        System.out.println("reverse :: " + stringReverseUsingLoop(Str));

        String a = "some";
        a= "thing";
        System.out.println(a);//thing

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
