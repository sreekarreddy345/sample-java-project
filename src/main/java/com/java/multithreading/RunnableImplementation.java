package com.java.multithreading;

class RunnerClassImplementation implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("Thread - " + Thread.currentThread().getId() + " is running");

        } catch (IllegalThreadStateException e) {

        }
    }
}

public class RunnableImplementation {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnerClassImplementation());
        for (int i = 0; i < 6; i++) {
            thread.start();
        }
    }
}


