package com.java.codingpoblems;

public class WordsReverse {

    public static void main(String[] args) {
        String str = "I am a good boy";
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
