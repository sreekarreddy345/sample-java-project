package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4, 6, 9, 7, 5};
//        int [] n = {1,2,2};
//        int a[] = {2,4,5,6,5};

        int target = 6;
        int[] result = getTwoSum(numbers, target);
        System.out.println("index of - " + result[0] + " , " + result[1]);
    }


//                  {1, 2, 4, 6, 9, 7, 5};
    public static int[] getTwoSum(int[] numbers, int target) {//6
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitedNumber.containsKey(delta)) {
                return new int[]{i, visitedNumber.get(delta)};
            }
            visitedNumber.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }

}
