package com.java.codingpoblems;

import java.util.Stack;

public class QueueUsingStacks1 {
    public static void main(String[] args) {
        Queueee<Integer> queueee = new Queueee<Integer>();
        queueee.enqueue(1);
        queueee.enqueue(2);
        queueee.enqueue(3);
        queueee.enqueue(4);
        queueee.enqueue(5);

        System.out.println(queueee.dequeue());
        System.out.println(queueee.dequeue());
        System.out.println(queueee.dequeue());
        System.out.println(queueee.dequeue());
        System.out.println(queueee.dequeue());
    }
}

class Queueee<T> {
    private Stack<T> inbox = new Stack<>();
    private Stack<T> outbox = new Stack<>();

    public void enqueue(T value) {
        inbox.push(value);
    }

    public T dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
}

