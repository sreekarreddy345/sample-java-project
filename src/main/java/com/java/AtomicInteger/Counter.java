package com.java.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger counter = new AtomicInteger(0);
    //AtomicInteger internally uses Volatile and it implements compareAndSwap algorithm.
    //No need to use Synchronized and volatile keywords for incrementing values as shared data / class variables

    public int getValue() {
        return counter.get();
    }

    public int increment() {
        return counter.getAndIncrement();
    }
}
