package com.java.codingpoblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter input value to check - ");
            input = scanner.nextInt();
            boolean isPrime = true;

            for (int j = 2; j < input; j++) {
                if (input % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(input + " - is a prime number");
            } else {
                System.out.println(input + " - is not a prime number");
            }
        }
    }
}
