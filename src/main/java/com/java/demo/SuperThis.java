package com.java.demo;

public class SuperThis {


    SuperThis() {
        System.out.println("Parent default construtor");
    }

    SuperThis(int i) {
        System.out.println("Parent argumented constructor");
    }
}


class B extends SuperThis {
    B() {
        //if no super is called by default it will go for super
        //super(30);
        this(20);
        System.out.println("Child default construtor");
    }

    B(int j) {
        // compiler default super();
        System.out.println("Child argumented constructor");
    }

    public static void main(String args[]) {
        B a = new B();

    }

}


