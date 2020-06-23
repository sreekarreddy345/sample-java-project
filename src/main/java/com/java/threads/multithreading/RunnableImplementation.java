package com.java.threads.multithreading;

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

        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new RunnerClassImplementation());
            thread.setName("newThread");
            thread.start();

        }
    }
}


