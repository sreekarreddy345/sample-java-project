package com.java.demo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};//  array should be sorted to perform binary search
        int last = arr.length - 1;
        int key = 40;
        binarySearch(arr, 0, last, key);

    }

    public static void binarySearch(int[] arr, int first, int last, int key) {

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("element found at index - " + mid);
                break;
            } else {
                last = mid - 1;
            }
        }
        if (first > last) {
            System.out.println("element not found");

        }

    }
}
