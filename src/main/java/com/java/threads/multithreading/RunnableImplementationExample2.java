package com.java.threads.multithreading;

public class RunnableImplementationExample2 {
    public static void main(String[] args) {

        AnotherClass ac = new AnotherClass();
        Thread t1 = new Thread(ac);
        t1.start();// this will start a new thread and run method will get execute

        for (int i = 0; i < 100; i++) {
            System.out.println("main - " + i);
        }
    }
}

class AnotherClass implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread - " + i);
        }
    }
}