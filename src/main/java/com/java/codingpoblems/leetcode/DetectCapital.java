package com.java.codingpoblems.leetcode;

public class DetectCapital {
    public static void main(String[] args) {
        boolean isCapital = detectCapitalUse("aAAAAAAA");
        System.out.println("isCorrect Capital - " + isCapital);
    }

    private static boolean detectCapitalUse(String word) {

        int length = word.length();
        if (length == 1) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) &&
                Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < length; i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < length; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
