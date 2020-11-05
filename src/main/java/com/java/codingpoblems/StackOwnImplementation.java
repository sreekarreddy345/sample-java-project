package com.java.codingpoblems;

class OwnStack {
    private int[] array;
    private int capacity;
    private int top;

    OwnStack(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.capacity = initialCapacity;
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("OwnStack is full");
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("OwnStack is Empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("OwnStack is Empty");
        }
        return array[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackOwnImplementation {
    public static void main(String[] args) {
        OwnStack ownStackObject = new OwnStack(10);
//        List list = new ArrayList(10);

        for (int i = 0; i < 6; i++) {
            ownStackObject.push(i);
        }
        System.out.println("peek - " + ownStackObject.peek());
        System.out.println("pop - " + ownStackObject.pop());
        System.out.println("peek - " + ownStackObject.peek());
    }
}
