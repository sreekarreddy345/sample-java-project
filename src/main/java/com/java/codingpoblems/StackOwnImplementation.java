package com.java.codingpoblems;

class Stack {
    private int[] array;
    private int capacity;
    private int top;

    Stack(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.capacity = initialCapacity;
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
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
        Stack stackObject = new Stack(10);
//        List list = new ArrayList(10);

        for (int i = 0; i < 6; i++) {
            stackObject.push(i);
        }
        System.out.println("peek - " + stackObject.peek());
        System.out.println("pop - " + stackObject.pop());
        System.out.println("peek - " + stackObject.peek());
    }
}
