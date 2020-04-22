package com.java.codingpoblems;

import java.util.HashSet;
import java.util.Set;

public class IntegerDuplicate {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 3, 3};

        System.out.print("Duplicate Element using Loop - ");
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j])) {
                    System.out.print(my_array[j] + " ");
                }
            }
        }
        System.out.println();

        Set<Integer> integers = new HashSet<>();
        System.out.print("Duplicate Element using set - ");
        for (int a : my_array) {
            if (!integers.contains(a)) {
                integers.add(a);
            } else {
                System.out.print(a + " ");
            }


        }
    }
}
