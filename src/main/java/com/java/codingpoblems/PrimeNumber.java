package com.java.codingpoblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter input value - ");
            input = scanner.nextInt();
            boolean isComposite = false;

            for (int j = 2; j < input; j++) {
                if (input % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println(input + " - is not a composite number");
            } else {
                System.out.println(input + " - is a prime number");
            }
        }
    }
}
