package com.java.codingpoblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfArrayEqualsTarget {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 6, 7, 2, 9, 1, 5};
        int target = 8;
        printpairs(numbers, target);
    }

    //todo need write logic for the below code
    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int targetValue = target - numbers[i];
            if (visitedNumber.containsKey(targetValue)) {
                return new int[]{i, visitedNumber.get(targetValue)};
            }
            visitedNumber.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }

    static void printpairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            if (s.contains(temp)) { // checking for condition
                System.out.println("Pair with given sum  (" + arr[i] + ", " + temp + ")");
            }
            s.add(arr[i]);
        }


    }

}
