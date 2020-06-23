package com.java.codingpoblems;

public class PalindromeCheck {
    public static void main(String[] args) {

        String a = "Java Code Geeks";
//        System.out.println(a.charAt(22));
//        System.out.println(a.subSequence(10,20));
//        System.out.println(a.substring(20));


        String s = "madam";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        System.out.println("Is String Palindrome - " + s.equalsIgnoreCase(sb.toString()));

    }
}
