package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;

public class SumOfArrayEqualsTarget {
    public static void main(String[] args) {
//        int[] numbers = new int[]{1, 2, 6, 9, 4, 7, 5};
//        int[] numbers = new int[]{7, 9, 3, 5, 3, 4, 3};
        int[] numbers = new int[]{3, 6, 7, 2, 9, 1, 5};
//        int [] n = {1,2,2};
//        int a[] = {2,4,5,6,5};

        int target = 8;
        int[] result = getTwoSum(numbers, target);
        System.out.println("index of - " + result[1] + " , " + result[0]);
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

}
