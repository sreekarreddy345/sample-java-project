package com.java.threads.producerandconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerAndConsumerUsingWait<E> {
    private int max;
    private Queue<E> queue;
    private ReentrantLock lock = new ReentrantLock(true);
    private Object notEmpty = new Object();
    private Object notFull = new Object();

    public ProducerAndConsumerUsingWait(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public synchronized void put(E e) throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == max) {
                notFull.wait();
            }
            queue.add(e);
            notEmpty.notifyAll();
        } finally {
            lock.unlock();
        }
    }

    public synchronized E take() throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == 0) {
                notEmpty.wait();
            }
            E removedItem = queue.remove();
            notFull.notifyAll();
            return removedItem;
        } finally {
            lock.unlock();
        }
    }
}
