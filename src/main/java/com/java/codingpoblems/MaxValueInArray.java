package com.java.codingpoblems;

public class MaxValueInArray {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 26, 14, 5, 32, 16, 14};

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {//> to get max
                max = a[i];
            }
        }
        System.out.println(max);

    }
}
