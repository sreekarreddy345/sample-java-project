package com.java.codingpoblems.hackerrankproblems.loops;

public class Multiples1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int n = 10;
        int sum = a + b;
        for (int j = 1; j <= n; j++) {
            System.out.print(sum + " ");
            sum += ((Math.pow(2, j)) * b);
        }
        System.out.println();
    }
}
