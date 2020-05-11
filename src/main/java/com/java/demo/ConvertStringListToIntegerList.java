package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringListToIntegerList {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("1", "2", "3");

        List<Integer> integers = convertStringToInteger(listOfString);
        System.out.println("integers - " + integers);

        List<Integer> integers1 = StringToInt(listOfString);
        System.out.println("integers1 - " + integers1);
    }

    private static List<Integer> StringToInt(List<String> listOfString) {
        List<Integer> intList = new ArrayList<>(listOfString.size());
        for (String a : listOfString) {
            int i = Integer.parseInt(a);
            intList.add(i);
        }
        return intList;
    }

    private static List<Integer> convertStringToInteger(List<String> stringList) {
        return stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
    }


}
