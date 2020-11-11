package com.java.codingpoblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfNumbers {
    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {3, 4, 5, 6};

        List<Integer> integers = Arrays.asList(array1);
        List<Integer> integers1 = Arrays.asList(array2);

        Set<Integer> set = new HashSet<>(integers);
        Set<Integer> set1 = new HashSet<>(integers1);

        set.retainAll(set1);
        Integer[] integers2 = set.toArray(new Integer[set.size()]);
        for (int aa : integers2) {
            System.out.print(aa + ",");
        }
        System.out.println();

        Object[] ints1 = Arrays.stream(array1)
                .distinct()
                .filter(x -> Arrays.stream(array2).anyMatch(y -> y == x))
                .toArray();
        for (Object i : ints1) {
            System.out.print(i + ",");
        }
    }
}
