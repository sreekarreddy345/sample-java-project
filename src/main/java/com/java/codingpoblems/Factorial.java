package com.java.codingpoblems;

public class Factorial {
    public static void main(String[] args) {
        getFactorialUsingIteration(4);
        System.out.println(multiplyNumbers(4));
    }

    private static void getFactorialUsingIteration(int factorialNumber) {
        int factorial = 1;
        if (factorialNumber > 0) {
            for (int i = 1; i <= factorialNumber; i++) {
                factorial = factorial * i;

            }
        }
        System.out.println("factorial - " + factorial);
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}
