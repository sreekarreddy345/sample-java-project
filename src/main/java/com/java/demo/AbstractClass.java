package com.java.demo;

abstract class Shape {

    void draw() {
        System.out.println("drawing shape");
    }

    abstract void show();

}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void show() {

    }
}
class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void show() {

    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle();
        shape.draw();


    }

}
