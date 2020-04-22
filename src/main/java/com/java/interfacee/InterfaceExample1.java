package com.java.interfacee;

interface aa {

    int a = 10;

    static void met() {
        System.out.println("This is an static method in interface");
    }

    default void meth2() {
        System.out.println("This is an default method in interface");
    }
}

public class InterfaceExample1 implements aa {

    public static void main(String[] args) {
        InterfaceExample1 obj = new InterfaceExample1();
        obj.meth2(); // this will call the interface method if it is not implemented in the class
        obj.meth2();
        aa.met();

        /*aa obj1 = new aa() {
            @Override
            public void meth2() {

            }
        };

        obj1.meth2();*/

    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am over riding meth2");
//    }
}
