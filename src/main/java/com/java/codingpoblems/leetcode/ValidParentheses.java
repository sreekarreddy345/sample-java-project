package com.java.codingpoblems.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Text - ");
            String value = sc.next();
            System.out.println("isValid - " + isValidString(value));
        }
    }

    private static boolean isValid(String value) {
        Stack<Character> stack = new Stack<>();
        for (char c : value.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }

    static boolean isValidString(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char a : chars) {
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else if (a == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (a == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (a == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
