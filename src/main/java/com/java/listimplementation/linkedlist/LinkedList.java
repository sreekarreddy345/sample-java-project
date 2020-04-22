package com.java.listimplementation.linkedlist;


public class LinkedList {
    Node head;// null

    public void insert(int data) { // data = 18,45,12
        Node node = new Node();// initialising node

        node.data = data;// assigning data to node
        node.next = null;//initialising node next as null

        if (head == null) { // checking if head is null
            head = node;// if head is null assigning node as head or starting value of the linked list
        } else {
            Node n = head; // assigning node n as head to traverse from start.
            while (n.next != null) { // checking if n.next is not null
                n = n.next; // jumping to next node
            }
            n.next = node;//assigns the value of next node to current node n.next
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;// assigning node.next with head value
        head = node; // making new node as head

    }

    public void insertAt(int index, int data) {
        Node node = new Node();

        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;// assigning node n as head to traverse from start.
            for (int i = 0; i < index - 1; i++) { //  giving index -1 to reach a value before index.
                n = n.next;// to traverse every time who have do to n.next, reassigning n value with n.next
            }
            node.next = n.next;// pointing new node.next to the value of next node
            n.next = node; //pointing n.next to node
        }
    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;  //  ??
            n.next = n1.next;  //  ??

        }
    }

    public void show() {
        Node node = head;// start from head
        while (node.next != null) {// checks if node.next is not equal to null
            System.out.println(node.data);//printing the data in the node
            node = node.next;// moving the node to node.next/traversing through the node
        }
        System.out.println(node.data);//since the last node has next as null we are printing it out of while loop
    }


}
