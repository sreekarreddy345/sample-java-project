package com.java.designpattern.singleton;

public class SingletonExample {
    private static volatile SingletonExample instance;


    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonExample instance = SingletonExample.getInstance();
        System.out.println(instance.hashCode());
        SingletonExample instance1 = SingletonExample.getInstance();
        System.out.println(instance1.hashCode());
    }

}

