package com.java.demo;

interface A1 {
    public final static int MAX1 = 100;
}

interface B1 {
    public final static int MAX1 = 100;
}


public class Output implements A1, B1 {


    public static void main(String[] args) {

            System.out.println(A1.MAX1);
            System.out.println(B1.MAX1);

    }

}