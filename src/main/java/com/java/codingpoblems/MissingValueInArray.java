package com.java.codingpoblems;

public class MissingValueInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};


        System.out.println("last element - " + a[a.length - 1]);
//  if it is sorted we can provide the last element
        int limit = 15;

        int totalSumOfArray = sumOfArray(limit);
        int totalSumOfElements = sumOfElements(a);
        int missingElement = totalSumOfArray - totalSumOfElements;
        System.out.println("missingElement - " + missingElement);
    }

    private static int sumOfElements(int[] elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
        return sum;

    }

    private static int sumOfArray(int limit) {
        int sum = 0;
        return sum = limit * (limit + 1) / 2;

    }
}
