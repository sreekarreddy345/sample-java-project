package com.java.demo;

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
/*        ArrayList<String> strings = new ArrayList<>();
        strings.add("ds");
        strings.add("sd");
        strings.add("sfd");
        strings.add("sc");
        strings.add("qwd");
        strings.add("jvh");
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }*/
    }

    public static void main(String[] args) {
        getInstance();
    }
}
