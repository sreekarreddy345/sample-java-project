package com.java.codingpoblems;

public class RemoveNumbersFromString {
    public static void main(String[] args) {
        String s = "Abc123defgh56";
        String s1 = s.replaceAll("[^0-9]", "");// remove anything except 0-9
        String s2 = s.replaceAll("[^a-zA-Z]", "");// remove anything except a-zA-Z
        System.out.println(s1);
        System.out.println(s2);

    }
}
