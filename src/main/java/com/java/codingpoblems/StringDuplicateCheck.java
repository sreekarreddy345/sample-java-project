package com.java.codingpoblems;

import java.util.*;

public class StringDuplicateCheck {
    public static void main(String[] args) {
        String str = "abcabcd";

        List<String> list = new ArrayList<>();
        char[] chararr = str.toCharArray();
//        StringBuilder a = new StringBuilder();
      /*  for (int i = 0; i < chararr.length; i++) {
            for (int j = 1 + 1; j < chararr.length; j++) {
                if (chararr[i] == chararr[j] && (i != j)) {
                    System.out.println("duplicate element - " + chararr[j]);
                }
            }
            list.add(Character.toString(chararr[i]));
        }*/

        String[] strings = list.toArray(new String[0]);

        System.out.println("unique String is - " + Arrays.toString(strings));

        String str1 = "aabbcddeeffabd";
        char[] ch = str1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char key : ch) {
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println("print - " + map);
        for (char val : map.keySet()) {
            System.out.println("key -> " + val + " no of times  ->" + map.get(val));
            if (map.get(val) > 1) {
                System.out.println("Duplicate Element - " + val);
            } else {
                System.out.println("unique Element - " + val);
            }
        }
    }
}
