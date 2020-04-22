package com.java.demo;

interface Hunter{

}
abstract class Animal{

}

class Cat extends Animal implements Hunter{

    Hunter hunter = new Cat();
    Animal animal = new Cat();
    Cat cat = new Cat();


}
public class Tiger extends Cat {

    Hunter hunter1 = new Tiger();
    Animal animal1 = new Tiger();
    Cat cat = new Cat();
    Tiger tiger = new Tiger();;


}
