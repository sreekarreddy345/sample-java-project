package com.java.threads;

public class AsyncMethod {
    public static void main(String[] args) {
        AsyncMethod asyncMethod = new AsyncMethod();
        for (int i = 0; i <10 ; i++) {

            asyncMethod.someAsyncMethod();
        }
    }
//@Async will make it create multiple threads which is a spring dependency
    public void someAsyncMethod() {
        try {
            Thread.sleep(10);  // Let me sleep for 3 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My Name " + Thread.currentThread().getName());

    }
}

