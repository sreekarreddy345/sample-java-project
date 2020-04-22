package com.java.codingpoblems.hackerrankproblems.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

//    https://www.hackerrank.com/challenges/java-arraylist/problem
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < b; j++) {
                row.add(sc.nextInt());
            }
            rows.add(row);
        }

        int c = sc.nextInt();
        for (int k = 0; k < c; k++) {
            int d = sc.nextInt();
            int e = sc.nextInt();
            try {
                System.out.println(rows.get(d - 1).get(e - 1));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
