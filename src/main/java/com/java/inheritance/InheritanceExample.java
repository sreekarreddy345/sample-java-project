package com.java.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.sample();
        obj.help();
    }

}

class ParentClass {
    int a = 10;

    public void sample() {
        System.out.println("parent class - " + a);
    }

    public void help() {
        System.out.println("I am help from parent class");
    }
}


class ChildClass extends ParentClass {
    int a = 20;

    public void sample() {
        System.out.println("value of a from parent class - " + super.a); // a is from parent class since we mentioned super
        System.out.println("value of a from child class - " + this.a);
        // help() can be called either directly - help() or using super - super.help or by creating object
        help();
        super.help();
    }
}


