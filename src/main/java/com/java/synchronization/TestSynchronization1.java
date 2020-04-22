package com.java.synchronization;

//example of java synchronized method

class Table {
    synchronized void printTable(int n) {//method synchronized

        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
//                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) throws Exception {

        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
//        t1.join(); //used to say t2 should start after t1
        t2.start();
    }
}