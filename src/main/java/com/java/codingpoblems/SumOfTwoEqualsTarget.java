package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoEqualsTarget {
    public static void main(String[] args) {
        int target = 17;
        int a[] = {5, 6, 8, 3, 4, 3, 7, 9, 2, 3, 1, 8};
        int[] twoSum = getTwoSum(a, target);
        System.out.println("target equals sum of - " + a[twoSum[0]] + " and " + a[twoSum[1]]);
        int[] ints = sumOfTwo(a, target);
        System.out.println("target equals sum of - " + a[ints[0]] + " and " + a[ints[1]]);
    }


    public static int[] getTwoSum(int[] a, int target) {
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int targetValue = target - a[i];
            if (visitedNumber.containsKey(targetValue)) {
                return new int[]{i, visitedNumber.get(targetValue)};
            }
            visitedNumber.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] sumOfTwo(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int delta = target - a[i];
            if (map.containsKey(delta)) {
                return new int[]{map.get(delta), i};
            }
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }
}
