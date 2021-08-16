package com.java.codingpoblems;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        findFirstAndLast(arr, 2);
    }

    public static void findFirstAndLast(int[] arr, int number) {

        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number != arr[i]) {
                continue;
            }
            if (first == -1) {
                first = i;
            }
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        } else
            System.out.println("Not Found");
    }
}


