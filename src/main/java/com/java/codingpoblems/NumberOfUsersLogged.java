package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;

public class NumberOfUsersLogged {
    public static void main(String[] args) {
        String str[] = "User1, User2, User1, User1, User3".split(", ");
        int len = str.length;
        Map<String, Integer> map = new HashMap();

        for (String s : str) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, ++count);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);

    }
}
