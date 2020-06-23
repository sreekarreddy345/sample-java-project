package com.java.threads.threadpool;

public class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String s) {
        this.name = s;
    }

    @Override
    public void run() {
        System.out.println("Thread Started - " + name);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Ended - " + name);

    }
}
