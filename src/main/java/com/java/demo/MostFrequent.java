package com.java.demo;

import java.util.Arrays;

public class MostFrequent {

//Java program to find the most frequent element
//in an listimplementation

    public static void main(String[] args) {

        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;

        System.out.println(mostFrequent(arr, n));

    }


    public static int mostFrequent(int arr[], int n) {

        // Sort the listimplementation
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1;
        int res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count) {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }
    // Driver program
}


