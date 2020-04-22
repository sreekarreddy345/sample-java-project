package com.java.demo;

import java.util.*;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> stringList = Collections.synchronizedList(strings);
        stringList.add("asdfgh");
        stringList.add("uhsdfifeas");
        stringList.add("khsdkfsfs");

        HashSet<String> objects = new HashSet<>();
        objects.add("efcef");

        for (String a : objects) {
            System.out.println(a);
        }





    }

}
