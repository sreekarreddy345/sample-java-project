package com.java.demo;

public class MiddleElement {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 2, 83, 1, 9, 10,7};

        middleElement(a);
    }

    public static void middleElement(int[] b) {
        if (b.length % 2 == 0) {
            int i = b.length / 2;
            System.out.println("Middle element index is - " + i);
        } else {
            int[] a;
            a = new int[1];
            a[0] = b[b.length/2];

            System.out.println("Middle element index is --- " + a[0]);

        }
//        return c;

    }


}
