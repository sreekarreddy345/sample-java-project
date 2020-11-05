package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("sree", "sree", "hhgkj", "ddsdsf");


        // distinct element or to remove duplicate elements
        a.stream().distinct().forEach(ele -> System.out.println("elements - " + ele));
        List<String> bond = (List<String>) a.stream().filter(b -> b.contains("bond"));

        List<String> bondfiles = new ArrayList<>();


//        List<String> b = a.stream().map((String) aa->getFullName(a));
        List<String> strings = a.stream().map(StreamForEachExample::getFullName).collect(Collectors.toList());
        List<String> collect = strings.stream().map(StreamForEachExample::getFullName).collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(collect);

    }



    public static String getFullName(String names) {

        return names.concat(" name");
    }
}
