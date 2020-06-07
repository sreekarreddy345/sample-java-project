package com.java.designpattern.singleton;

public class SingletonExamplee {
    private static volatile SingletonExamplee instance;


    public static SingletonExamplee getInstance() {
        if (instance == null) {
            synchronized (SingletonExamplee.class) {
                if (instance == null) {
                    instance = new SingletonExamplee();
                }
            }
        }
        return instance;
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        SingletonExamplee instance = SingletonExamplee.getInstance();
        SingletonExamplee instance1 = SingletonExamplee.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

