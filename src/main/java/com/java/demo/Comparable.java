package com.java.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        String s = "reddy";
        StringBuilder stringBuilder = new StringBuilder("Sreekar ");
        stringBuilder.append(s);
        String s1 = stringBuilder.toString();
        System.out.println("name - " + s1);

        List<Integer> list = new ArrayList<>();
        Collection<Integer> i = Collections.synchronizedCollection(list);
        i.add(9);
        i.add(2);
        i.add(32);
        i.add(312);
        i.add(45);
        i.add(7);
        i.add(6);
        i.add(78);

//        Collections.sort(i);

        for (int a : i
        ) {
            System.out.print(a + ",");
        }
    }
}
