package com.java.codingpoblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter input value - ");
            input = scanner.nextInt();
            boolean isPrime = false;

            for (int j = 0; j < input / 2; j++) {
                if (input % 2 == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(input + " - is not a prime number");
            } else {
                System.out.println(input + " - is a prime number");
            }
        }
    }
}
