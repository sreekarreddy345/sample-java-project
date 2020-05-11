package com.java.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arrayOfValues = {2, 25, 23, 24, 54, 45, 136, 6, 4, 6, 1, 44};
        int[] sortedValues = sortingUsingLoop(arrayOfValues);
        for (int ints1 : sortedValues) {
            System.out.print(ints1 + ",");
        }

        sortingUsingStreams();
        stringSortingInArray();
    }

    public static int[] sortingUsingLoop(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[i] > array[j]) {// > symbol to get values in ascending and < symbol to get values descending
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    private static void sortingUsingStreams() {
        List<Integer> listOfValues = Arrays.asList(2, 25, 23, 24, 54, 45, 136, 6, 4, 6, 1, 44);
        List<Integer> sortedList = listOfValues.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::print);
    }

    private static void stringSortingInArray() {
//        List<Integer> listOfValues = Arrays.asList(2, 25, 23, 24, 54, 45, 136, 6, 4, 6, 1, 44);
//        List<Integer> sortedList = listOfValues.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::print);

        String[] a = new String[]{"d", "a", "e", "h", "j", "v"};
        Arrays.sort(a);
        for (String b : a) {
            System.out.print(b + " ");
        }

    }
}
