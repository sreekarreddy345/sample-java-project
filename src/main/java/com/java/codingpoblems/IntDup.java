package com.java.codingpoblems;

public class IntDup {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 4, 5, 3, 6, 7, 8, 6, 6, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j])) {
                    System.out.println("Duplicate Element - " + a[j]);
                }
            }
        }
    }
}
