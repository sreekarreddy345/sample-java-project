package com.java.codingpoblems;

import java.util.Set;
import java.util.TreeSet;

public class SubsetOfElements {
    public static void main(String[] args) {
        //get subset of two Strings
        String a = "abcd";
        String b = "cdef";
        String c = a.concat(b);
        Set<Character> set = new TreeSet<>();
        /*Set<Character> set1 = new TreeSet<>();
        for (Character ch : c.toCharArray()) {
            if (!set.contains(ch)) {
                set1.add(ch);
            } else {
                set1.add(ch);
            }
        }*/

        for (Character ch : c.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                System.out.println(ch);
            }
        }
    }
}
