package com.java.codingpoblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntegerDuplicate {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 3, 3};

        duplicateElementUsingLoop(my_array);

        System.out.println();

        duplicateElementUsingSet(my_array);
        System.out.println("using map");
        duplicateElementUsingMap(my_array);
    }

    private static void duplicateElementUsingSet(int[] my_array) {
        Set<Integer> set = new HashSet<>();
        System.out.print("Duplicate Element using set - ");
        for (int a : my_array) {
            if (!set.contains(a)) {
                set.add(a);
            } else {
                System.out.print(a + " ");
            }
        }
    }

    private static void duplicateElementUsingLoop(int[] my_array) {
        System.out.print("Duplicate Element using Loop - ");
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j])) {
                    System.out.print(my_array[j] + " ");
                }
            }
        }
    }

    private static void duplicateElementUsingMap(int[] my_array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : my_array) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else {
                Integer integer = map.get(a);
                map.put(a, ++integer);
            }
        }
        for (Integer set : map.keySet()) {
            System.out.println(set + " count - " + map.get(set));
        }

    }
}
