package com.java.demo;

public class CountObjects {
    static int i;

    CountObjects() {
        i++;
    }

    public static void main(String[] args) {
        CountObjects countObjects1 = new CountObjects();
        CountObjects countObjects2 = new CountObjects();
        CountObjects countObjects3 = new CountObjects();

        countObjects1.countNumberOfObjects();
    }

    public void countNumberOfObjects() {
        System.out.println("Number of Objects - " + i);
    }
}
