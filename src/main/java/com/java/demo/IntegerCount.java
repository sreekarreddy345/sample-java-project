package com.java.demo;

public class IntegerCount {
    public static void main(String[] args) {
        int a, b, sum = 0;

        a = 123;
        while (a > 0) {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
