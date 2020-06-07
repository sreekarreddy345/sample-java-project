package com.java.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance = getInstance();
        System.out.println(instance.hashCode());
        Singleton instance1 = getInstance();
        System.out.println(instance1.hashCode());
    }
}
