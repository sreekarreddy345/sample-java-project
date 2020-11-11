package com.java.codingpoblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
//        System.out.println(getUniqueCharacterSubstringBruteForce("HelloHowAreYou"));
        System.out.println(getLongestSubString("HelloHowAreYou"));

    }

    static String getLongestSubString(String str) {
        Set<Character> set = new HashSet<>();
        String longestTillNow = "";
        String longestOverAll = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                if (set.contains(c)) {
                    longestTillNow = "";
                    set.clear();
                    break;
                }
                longestTillNow += c;
                set.add(c);
                if (longestTillNow.length() > longestOverAll.length()) {
                    longestOverAll = longestTillNow;
                }
            }
        }
        return longestOverAll;
    }
// don't know how below code works
    /*static String getUniqueCharacterSubstringBruteForce(String input) {
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
    }*/
}
