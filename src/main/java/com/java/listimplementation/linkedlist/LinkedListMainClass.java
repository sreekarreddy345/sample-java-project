package com.java.listimplementation.linkedlist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListMainClass {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        List linkedList1=  new CopyOnWriteArrayList();


        linkedList.insert(18);
        linkedList.insert(45);
        linkedList.insert(12);

        linkedList.insertAtStart(25);

        linkedList.insertAt(0, 55);

        linkedList.deleteAt(2);

        linkedList.show();

    }

}
