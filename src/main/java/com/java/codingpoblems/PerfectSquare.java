package com.java.codingpoblems;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number - ");
        int num = sc.nextInt();
        for (int j = 1; j < num; j++) {
            if (j * j == num) {
                System.out.println("Given Number is perfect Square of - " + j);
            }
        }


    }
}
