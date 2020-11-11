package com.java.codingpoblems;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int a = 123456789;
        int copy = a;
        int sum = 0;
        while (copy != 0) {
            int lastDigit = copy % 10;
            sum = sum + lastDigit;
            copy = copy / 10;
        }
        System.out.println("Sum of " + a + " numbers - " + sum);
    }
}
