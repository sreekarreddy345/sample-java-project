package com.java.multithreading;

class MultiThread extends Thread {


    @Override
    public void run() {
        try {
            System.out.println("Thread - " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadImplementation {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            MultiThread multiThread = new MultiThread();
            multiThread.start();// one way to run thread by using class object.start();
            Thread thread = new Thread(new MultiThread());
            thread.start();//second way to run thread by using thread object.start();
        }
    }
}


