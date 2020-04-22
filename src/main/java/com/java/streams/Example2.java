package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<String> aa = Arrays.asList("gjsj", "habda", "are", "uyggefieaf");
        Stream<String> stream = aa.stream();
        boolean isAre = stream.anyMatch(s -> s.equals("are"));
        System.out.println("Is " + isAre);

        List<String> collect = aa.stream().map(Example2::getCount).map(StreamForEachExample::getFullName).collect(Collectors.toList());

        System.out.println("Collect - " + collect);
    }

    public static String getCount(String word) {
        int length = word.length();
        String addcount;
        return  addcount = word + " - " + length;

    }
}
