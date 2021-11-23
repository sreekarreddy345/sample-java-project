package com.java.codingpoblems;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "How are you";
        String[] s = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String a : s) {
            StringBuilder sb = new StringBuilder();
            for (int i = a.length() - 1; i > 0; i--) {
                sb.append(a.charAt(i));
            }
            stringBuilder.append(sb).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
