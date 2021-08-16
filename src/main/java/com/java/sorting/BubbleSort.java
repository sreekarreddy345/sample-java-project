package com.java.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 3, 2, 9, 4, 8, 6, 7, 1};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + ",");
        }
    }
/*
  todo time complexity for Bubble sort
        best  - O(n)
        avg   - O(n^2)
        worst - O(n^2)
    space complexity
        O(1)
*/

//    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//    it will sort the array in (array -1) swaps
private static void bubbleSort(int[] array) {
    int length = array.length;
    int temp = 0;
    for (int i = 0; i < length; i++) {
        for (int j = 1; j < (length - i); j++) {
            if (array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
            }
        }
    }
}
