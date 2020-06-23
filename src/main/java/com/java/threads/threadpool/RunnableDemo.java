package com.java.threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Thread pool
public class RunnableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            for (int i = 0; i < 10; i++) {
                Runnable runnable = new MyRunnable("My Worker Thread - " + i);
                executorService.execute(runnable);
            }
        } finally {
            executorService.shutdown();
        }
        while (!executorService.isTerminated()) {

        }
        System.out.println("All Requests Completed Successfully");

    }

}
