package com.java.codingpoblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(2);
        queue.add("sreekar");
        queue.add("sreekar1");
        queue.add("sreekar2");
        queue.add("sreekar3");

//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue.size());


    }
}
