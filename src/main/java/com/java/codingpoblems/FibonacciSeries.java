package com.java.codingpoblems;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(10);
    }

    private static void fibonacciSeries(int limit) {
        int currentNumber = 0;
        int nextNumber = 1;
        for (int i = 0; i < limit; i++) {
            int fib = currentNumber + nextNumber;
            currentNumber = nextNumber;
            nextNumber = fib;
            System.out.print(fib + " ");


        }
    }
}