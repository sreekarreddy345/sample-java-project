package com.java.codingpoblems;

public class SubstractOneNumberFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                int temp = 0;
                temp = a[i] - 1;
                a[i] = temp;
            }
        }
        for (int i : a) {
            System.out.println(i + ",");
        }
    }
}
