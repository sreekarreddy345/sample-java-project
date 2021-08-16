package com.java.sorting;

public class SelectionSort {
        /*
     todo time complexity for selection sort
            best  - O(n^2)
            avg   - O(n^2)
            worst - O(n^2)
        space complexity
            O(1)
    */

    public static void main(String[] args) {
        int[] arrayOfValues = {2, 25, 23, 24, 54, 45, 136, 6, 4, 6, 1, 44};

        for (int i = 0; i < arrayOfValues.length; i++) {
            for (int j = 0; j < arrayOfValues.length; j++) {
                if (arrayOfValues[i] < arrayOfValues[j]) {
                    int temp = arrayOfValues[i];
                    arrayOfValues[i] = arrayOfValues[j];
                    arrayOfValues[j] = temp;
                }
            }
        }
        for (int i : arrayOfValues) {
            System.out.print(i + ",");
        }
    }
}
