package com.java.codingpoblems.hackerrankproblems;

import java.util.Scanner;

public class ScannerProblem {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();// to read the next line
        double d = scan.nextDouble();
        scan.nextLine(); // to read the next line
        String s = scan.nextLine();

        System.out.printf("String: " + s);
        System.out.printf(s,9);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


//   1.   The Scanner.nextInt method does not read the newline character in your input created by
//        hitting "Enter," and so the call to Scanner.nextLine returns after reading that newline.

//   2.   You will encounter the similar behaviour when you use Scanner.nextLine
//        after Scanner.next() or any Scanner.nextFoo method (except nextLine itself).

//   3.   Workaround:
//        Either put a Scanner.nextLine call after each Scanner.nextInt or
//        Scanner.nextFoo to consume rest of that line including newline

