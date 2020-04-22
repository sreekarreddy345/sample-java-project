package com.java.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String next = bufferedReader.readLine();
        System.out.println("printing - " + next);
        bufferedReader.close();

    }
}
