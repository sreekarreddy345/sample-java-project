package com.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntegerListToStringList {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1, 2, 3);
        List<String> stringList = convertIntegerListToStringList(listOfInteger);
        System.out.println("stringList - " + stringList);
    }

    private static List<String> convertIntegerListToStringList(List<Integer> listOfInteger) {
        return listOfInteger.stream().map(String::valueOf).collect(Collectors.toList());
    }

}
