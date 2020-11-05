package com.java.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add("sreekar");
        set.add("reddy");
        set.add("suidfs");
        set.add("bsjgfjsd");
        set.add("hshfskd");
        set.add("skhefhes");
        for (String a : set) {
            System.out.println(a);
        }

        String a = "aabbvccddee";
        char ch[] = a.toCharArray();
        Set<Character> sett = new HashSet<>();
        for (Character b : ch) {
            if (!sett.contains(b)) {
                sett.add(b);
            } else {
                System.out.println("duplicate element");
            }
        }

    }

    public synchronized static boolean sample(List<String> listt) {

        return listt.remove("hi");
    }


}
