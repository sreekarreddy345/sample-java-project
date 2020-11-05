package com.java.codingpoblems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            int j = sc.nextInt();

            if (j % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}
