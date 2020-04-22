package com.java.codingpoblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingValuesInArrayUsingArrayList {

    public static void main(String[] args) {

        Integer a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};

        List<Integer> missingArrayList = new ArrayList<>(Arrays.asList(a));
        List<Integer> listOfNUmber = getListOfNUmber(1, 15);
        listOfNUmber.removeAll(missingArrayList);
        System.out.println(listOfNUmber);
    }

    public static List<Integer> getListOfNUmber(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
    }
}
