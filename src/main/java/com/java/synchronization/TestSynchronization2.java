package com.java.synchronization;

//Program of synchronized method by using anonymous class

class Table2 {
    synchronized void printTable(int n) {//synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class TestSynchronization2 {
    public static void main(String args[]) throws Exception {
        final Table2 obj = new Table2();//only one object

        // anonymous class
        Thread t1 = new Thread(() -> obj.printTable(5));
        Thread t2 = new Thread() {// anonymous class
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
//        t1.wait();
//        t1.notify(); // need to be notified to get the
//        Thread.sleep(100);//-	while sleep is used to introduce pause on execution
/*        The major difference is that wait() releases the lock or monitor
        while sleep() doesn’t releases the lock or monitor while waiting.
        wait() is used for inter-thread communication while sleep() is used to introduce
        pause on execution*/
    }
}