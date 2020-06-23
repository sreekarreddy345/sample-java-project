package com.java.codingpoblems;

import java.util.Arrays;

public class FindPrimeNumber {
    public static void main(String[] args) {
        secondLargestInArray();

        for (int i = 0; i < 100; i++) {
            boolean isComposite = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println(i + " - is a composite number");
            } else {
                System.out.println(i + " - is a prime number");
            }
        }
    }

    private static void secondLargestInArray() {
        int a[] = {1, 2, 3, 4, 26, 14, 5, 32, 16, 14};
        Arrays.sort(a);
        System.out.println("second largest - " + a[a.length - 2]);
    }
}
