package com.java.threads.multithreading;

class MultiThread extends Thread {


    @Override
    public void run() {
        try {
            System.out.println("Thread - " + Thread.currentThread().getName() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadImplementation {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            MultiThread multiThread = new MultiThread();
            multiThread.setName("this is multi thread");
            multiThread.start();// one way to run thread by using class object.start();

            Thread thread = new Thread(new MultiThread());
            thread.setName("this is threadddd");
            thread.start();//second way to run thread by using thread object.start();
        }
    }
}


