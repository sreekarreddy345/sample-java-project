package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        int restock = restock(Arrays.asList(1, 2, 4, 5, 6, 7), 6);
//        System.out.println(restock);
        twoSum(Arrays.asList(1, 2, 4, 5, 6, 7), 6);

        Map<String, String> map = new HashMap<>();

    }

    public static int restock(List<Integer> values, int target) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum = sum + values.get(i);
            if (sum >= target) {
                return sum - target;
            }
        }

        return target - sum;
    }


    //    public static int[] twoSum(List<Integer> values, int target) {
    public static void twoSum(List<Integer> values, int target) {
        int[] a = null;
        for (int i = 0; i < values.size(); i++) {
            int first = values.get(i);
            for (int j = 0; j < values.size(); j++) {
                int second = values.get(j);
                if ((first + second) == target) {
//                    a = new int[]{values.get(i), values.get(j)};
//                    a = new int[]{i, j};
                    System.out.printf("(%d, %d) %n", first, second);
                }


            }
        }
//        return a;
    }
}
