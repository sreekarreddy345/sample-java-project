package com.java.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayToList extends rr implements a{

    String[] a = {"sree", "reddy", "vaddi"};

    List list = Arrays.asList(a);

    @Override
    void eat() {
        super.eat();
    }

    public static void main(String[] args) {
        ArrayToList arrayToList = new ArrayToList();
        System.out.println(arrayToList.list);

    }


    @Override
    public void meth() {

    }
}

interface a{
    void meth();
}
class rr{
    void eat(){
        System.out.println("eating");
    }

}