package com.java.codingpoblems;

public class FindMissingValueInUnsortedArray {
    public static void main(String[] args) {
        int b[] = {5, 6, 4, 11, 13, 7, 14, 9, 2, 3, 1, 8, 10,};
        //first sort the elements if its not sorted already
        int[] sortedArray = sortTheElements(b);
        // sum all the value in the array
        int totalOfArray = sumOfArray(sortedArray);
        // sum all the values until the limit
        int sumOfValue = sumofValueUntilLimit(sortedArray[sortedArray.length - 1]);
        System.out.println("Missing Element = " + (sumOfValue - totalOfArray));
    }

    private static int sumofValueUntilLimit(int limit) {
        return (limit * (limit + 1) / 2);
    }

    private static int sumOfArray(int[] sortedArray) {
        int sumOfTotalArray = 0;
        for (int i : sortedArray) {
            sumOfTotalArray += i;
        }
        return sumOfTotalArray;
    }

    private static int[] sortTheElements(int[] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        return b;
    }
}
