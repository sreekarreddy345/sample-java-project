package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;

public class IntegerReverse {

    public static void main(String[] args) {
        int value = 987654321;

        //using int calculations
        System.out.println(reverseInteger(value));

        // by converting int to string
        String s = String.valueOf(value);
        String reverseString = reverseString(s);
        int reverseInt = Integer.parseInt(reverseString);
        System.out.println(reverseInt);

        int a[] = {1, 2, 5, 5, 6, 6, 7, 2, 3, 3};
        System.out.println("Duplicate elements");
        duplicateCheck(a);
    }

    public static int reverseInteger(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input = input / 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversed;
    }

    public static String reverseString(String input) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }

        return stringBuilder.toString();
    }


    public static void duplicateCheck(int[] values) {

//        {1, 2, 5, 5, 6, 6, 7, 2, 3, 3};
        Map<Integer, Integer> somemap = new HashMap<>();

        for (int aa : values) {
            if (somemap.containsKey(aa)) {
                Integer value = somemap.get(aa);
                somemap.put(aa, ++value);
            } else {
                somemap.put(aa, 1);
            }
        }
        for (Integer key : somemap.keySet()) {
            System.out.println(key + "value - " + somemap.get(key));
        }

    }


}
