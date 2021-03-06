package com.java.codingpoblems;

import java.util.*;

public class StringDuplicateCheck {
    public static void main(String[] args) {
        String str = "abcabcd";

        List<String> list = new ArrayList<>();


        char[] chararr = str.toCharArray();
//        StringBuilder a = new StringBuilder();
        for (int i = 0; i < chararr.length; i++) {
            for (int j = 1 + 1; j < chararr.length; j++) {
                if (chararr[i] == chararr[j] && (i != j)) {
                    System.out.println("duplicate element - " + chararr[j]);
                }
            }
            list.add(Character.toString(chararr[i]));
        }

        String[] strings = list.toArray(new String[0]);

        System.out.println("unique String is - " + Arrays.toString(strings));

        String str1 = "adbadhjbewd";
        char[] ch = str1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            char key = ch[i];
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        for (char c : map.keySet()) {

            System.out.println("key" + c + "no of times value repeated" + map.get(c));


            if (map.get(c) > 1) {

                System.out.println("Duplicate Element - " + c);
            } else {
                System.out.println("unique Element - " + c);
            }
        }
    }
}
