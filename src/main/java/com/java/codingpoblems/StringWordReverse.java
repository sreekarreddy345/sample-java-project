package com.java.codingpoblems;

public class StringWordReverse {
    public static void main(String[] args) {
        String a = "Hi Hello how are you";
        String reverseWord = getReverseWord(a);
        System.out.println(reverseWord);

    }

    public static String getReverseWord(String input) {
        String[] s = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]).append(" ");
        }
        String rev = "";
        for (int i = s.length - 1; i >= 0; i--) {
            rev = rev + " " + s[i];
        }
        System.out.println(rev);
        return sb.toString();
    }
}
