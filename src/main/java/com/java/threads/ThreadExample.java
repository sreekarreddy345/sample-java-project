package com.java.threads;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("my thread is in running state");
    }

    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        obj.run();
    }

}
