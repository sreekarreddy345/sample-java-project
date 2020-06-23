package com.java.threads.producerandconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerAndConsumerUsingLock<E> {
    //   Below ArrayBlockingQueue can be used without implementing all the logic
//    ArrayBlockingQueue<E> queue2 = new ArrayBlockingQueue<E>(10);
    private int max;
    private Queue<E> queue;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public ProducerAndConsumerUsingLock(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == max) {
                notFull.wait();
            }
            queue.add(e);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == 0) {
                notEmpty.wait();
            }
            E removedItem = queue.remove();
            notFull.signalAll();
            return removedItem;
        } finally {
            lock.unlock();
        }
    }
}
