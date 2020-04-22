package com.java.threads;

import java.io.IOException;

public class BlockingCallTest {
    public static void main(String[] args) throws IOException {

        System.out.println("calling blocking method");
        int input = System.in.read();
        System.out.println("finished blocking method - " + input);
    }
}
