package com.java.codingpoblems.leetcode;

import java.util.Scanner;

public class RemoveExtraParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter String - ");
            String input = sc.next();
            String validString = getValidString(input);
            System.out.println("valid String - " + validString);

        }
    }

    private static String makeValidString(String value) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : value.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            sb.append(c);
        }
        System.out.println("middle check - " + sb.toString());
        StringBuilder result = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if ((c == '(') && (open--) > 0) {
                continue;
            }
            result.append(c);
        }
        return result.reverse().toString();
    }

    static String getValidString(String str) {
        System.out.println("Given String - " + str);
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    continue;
                }
                count--;
            }
            sb.append(c);
        }

        StringBuilder s = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && count-- > 0) {
                continue;
            }
            s.append(c);
        }
        return s.reverse().toString();
    }


}
