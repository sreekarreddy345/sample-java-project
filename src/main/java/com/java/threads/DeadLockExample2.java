package com.java.threads;

public class DeadLockExample2 {

    // working DeadLock Example
    // to overcome the problem the order in which the lock is acquired

    public static void main(String[] args) {
        final Object resource1 = "This is resource one";
        final Object resource2 = "This is resource two";
// Run method in Thread below is implemented using lambda expression
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Locked Resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Locked Resource 2");
                }
            }
        });

// Run method in Thread below is implemented using run method
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Locked Resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();


    }
}
