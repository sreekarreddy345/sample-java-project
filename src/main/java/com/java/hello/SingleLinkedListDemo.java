package com.java.hello;

import java.util.Objects;

class Node<T> {

    private T data;
    private Node next;

    public Node(T data) {
        this(data, null);
    }

    public Node(T data, Node next) {
        Objects.requireNonNull(data);
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class SingleLinkedList<T> {
    private Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void  add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);
        }
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public T remove(int i) {

        return null;
    }

    public T get(int index) {

        if (size < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(" Index: " + index + ", Size: " + size);
        }

        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getData();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node curr = head;
        while (curr.getNext() != null) {
            sb.append(curr.getData() + ", ");
            curr = curr.getNext();

        }

        if (curr != null) {
            sb.append(curr.getData());
        }

        sb.append("]");
        return sb.toString();
    }
}

// remove
// finding middle element
// Detecting loop or not
// reverse the linkedlist
// find the nth element
// finding the length of list is even or odd?

public class SingleLinkedListDemo {
    public static void main(String[] args) {

        SingleLinkedList<String> list = new SingleLinkedList<>();


        System.out.println("IsLinkedListEmpty " + list.isEmpty());

        list.add("List1");
        list.add("List2");
        list.add("List3");
        list.add("List4");
        list.add("List5");
        list.add("List6");
        list.add("List7");
        list.add("List8");
        list.add("List9");
        list.add("List10");
        list.add("List11");
        list.add("List12");

        System.out.println("IsLinkedListEmpty " + list.isEmpty());
        System.out.println("List size " + list.size());

        System.out.println("List of 5 " + list.get(5));
        System.out.println("List of values " + list);
        list.remove(3);


    }
}