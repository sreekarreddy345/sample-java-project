package com.java.codingpoblems;

public class SwapValues {

    public static void main(String[] args) {
        int i = 10;
        int j = 15;

        j = j - i;
        i = i + j;
        j = i - j;

        System.out.println(i);
        System.out.println(j);
    }

}
