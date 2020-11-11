package com.java.codingpoblems;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistance {
    public static void main(String[] args) {
        char c = 'g';
        getShortestDistance("geeksforgeeks", c);
    }

    private static void getShortestDistance(String s, char X) {
        int a = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == X) {
                a = i;
            }
            if (a == Integer.MAX_VALUE) {
                list.add(Integer.MAX_VALUE);
            } else {
                list.add(i - a);
            }
        }

        a = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == X) {
                a = i;
            }
            if (a != Integer.MAX_VALUE) {
                list.set(i, Math.min(list.get(i), a - i));
            }
        }
        for (Integer b : list) {
            System.out.print(b + ",");
        }
    }
}
