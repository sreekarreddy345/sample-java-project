package com.java.demo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class EnumerationExampleUsingVector {

    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        List<String> str = new ArrayList<>();

        str = Collections.synchronizedList(str); // to make it synchronize

        List<String> concurrentList = new CopyOnWriteArrayList<>();

        concurrentList.add("\n  shbfhfs");
        concurrentList.add("shbfhfswef");
        concurrentList.add("shbfhfefs");
        concurrentList.add("shbwfefhfs");
        concurrentList.add("shbfhfsef  \n");


        strings.add("asdfgh");
        strings.add("uhsdfifeas");
        strings.add("khsdkfsfs");
        str.add("esfcs");
        str.add("edwaw");
        str.add("fsfssfawdwa");

        int value = strings.indexOf("asdfgh");
        System.out.println("Index value - " + value);

        Enumeration<String> stringEnumeration = strings.elements();

        while (stringEnumeration.hasMoreElements()) {
            System.out.println(stringEnumeration.nextElement());
        }

        Iterator<String> s = strings.iterator();
        while (s.hasNext()) {
            System.out.println("Iterator - " + s.next());
        }
        str.forEach(System.out::println);
//
//        Iterator<String> i = str.iterator();
//        while(i.hasNext()){
//            str.add("3dw");
////            i.remove();
//            System.out.println(i.next());
//        }

        ListIterator<String> stringListIterator = concurrentList.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());

        }

        concurrentList.forEach(System.out::println);


    }
}

