package com.java.codingpoblems.missingvalueinarray;

public class FindValueInArray {

    public static void main(String[] args) {

        // given input
        int[] input = {-1, 2, 1, 3, 4, 6, 7, 4};


        // let's create another array with same length
        // by default all index will contain zero
        // default value for int variable

        int[] register = new int[input.length];

        System.out.println("length of input - " + input.length);

        // now let's iterate over given array to
        // mark all present numbers in our register
        // array

        for (int i : input) {

            register[i] = 1;
        }

        // now, let's print all the absentees
        System.out.println("missing numbers in given array");

        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }

}