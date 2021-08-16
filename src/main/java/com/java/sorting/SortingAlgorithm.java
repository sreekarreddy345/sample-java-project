package com.java.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAlgorithm {

    public static void main(String[] args) {
        sortingUsingStreams();// sorting using streams
        stringSortingInArray();//sorting using arrays.sort
    }

    private static void sortingUsingStreams() {
        List<Integer> listOfValues = Arrays.asList(2, 25, 23, 24, 54, 45, 136, 6, 4, 6, 1, 44);
        List<Integer> sortedList = listOfValues.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    private static void stringSortingInArray() {
        String[] a = new String[]{"d", "a", "e", "h", "j", "v"};
        Arrays.sort(a);
        for (String b : a) {
            System.out.print(b + " ");
        }

    }
}
