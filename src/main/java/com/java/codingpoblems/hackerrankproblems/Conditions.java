package com.java.codingpoblems.hackerrankproblems;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 100) {
            if (n % 2 != 0) { //odd
                System.out.println("Weird");
            } else if (n >= 2 && n <= 5) {//even and >2 and <5
                System.out.println("Not Weird");
            } else if (n / 2 == 0 && n >= 6 && n <= 20) { // even and >=6 and <=20
                System.out.println("Weird");
            } else if (n > 20) { // >20
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
