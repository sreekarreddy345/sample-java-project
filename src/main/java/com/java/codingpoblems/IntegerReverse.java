package com.java.codingpoblems;

public class IntegerReverse {

    public static void main(String[] args) {
        int value = 987654321;

        System.out.println(reverseInteger(value));

        String s = String.valueOf(value);
        String reverseString = reverseString(s);
        int reverseInt = Integer.parseInt(reverseString);
        System.out.println(reverseInt);
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

        StringBuilder stringBUilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBUilder.append(input.charAt(i));
        }
        return stringBUilder.toString();
    }


}
