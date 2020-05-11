package com.java.codingpoblems;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(100);
    }

    private static void printFizzBuzz(int limit) {
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {//garmin
                System.out.println("FizzBuzz" + " - " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz" + " - " + i);//gar
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + " - " + i);//min
            } else {
                System.out.println(i);
            }
        }
    }
}
