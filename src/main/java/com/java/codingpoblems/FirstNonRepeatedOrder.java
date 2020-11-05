package com.java.codingpoblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedOrder {
    public static void main(String[] args) {

        String a = "abebfeuskfbklajief";
        getFirstNonRepeatedCharacter(a);
        System.out.println(firstNonRepeatedCharacter(a));

    }

    // first way
    public static void getFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (linkedHashMap.containsKey(c)) {
                int count = linkedHashMap.get(c);
                linkedHashMap.put(c, ++count);
            } else {
                linkedHashMap.put(c, 1);
            }
        }

        for (char cc : linkedHashMap.keySet()) {
            int value = linkedHashMap.get(cc);
            if (value == 1) {
                System.out.println("Non Repeated Character - " + cc);
                break;
            }
        }
    }

    // second way
    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<>();
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }

}


