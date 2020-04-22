package com.java.demo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 2, 83, 1, 9, 10};
        int searchElement = 2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) {
                System.out.println("Element found at index - " + i);
            }
        }

    }
}
