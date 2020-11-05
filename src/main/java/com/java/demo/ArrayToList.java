package com.java.demo;

import java.util.Arrays;
import java.util.List;

interface a {
    void meth();
}

public class ArrayToList extends rr implements a {

    String[] a = {"sree", "reddy", "sree", "sree", "sree", "sree", "vaddi"};

    List<String> list = Arrays.asList(a);

    public static void main(String[] args) {
        ArrayToList arrayToList = new ArrayToList();
        System.out.println(arrayToList.list);

    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    public void meth() {

    }
}

class rr {
    void eat() {
        System.out.println("eating");
    }

}