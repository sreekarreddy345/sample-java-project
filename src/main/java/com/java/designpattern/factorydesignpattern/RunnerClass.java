package com.java.designpattern.factorydesignpattern;

public class RunnerClass {
    public static void main(String[] args) {
        FactoryGenerator fg = new FactoryGenerator();
        OS obj = fg.getInstance("close");
        obj.spec();
    }
}
