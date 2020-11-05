package com.java.codingpoblems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean isStringAnagram = isAnagram(a, b);
        System.out.println(isStringAnagram);
    }

    public static boolean isAnagram(String str, String str1) {
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(ch);
        System.out.println(ch1);

        return Arrays.equals(ch, ch1);
    }
}
