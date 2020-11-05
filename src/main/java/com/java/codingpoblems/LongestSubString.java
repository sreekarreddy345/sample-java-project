package com.java.codingpoblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(getUniqueCharacterSubstringBruteForce("HelloHowAreYou"));
    }

    static String getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);  //H
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);      //H
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        return output;
    }
}
