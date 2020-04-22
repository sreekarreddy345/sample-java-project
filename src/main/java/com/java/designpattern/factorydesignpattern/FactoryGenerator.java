package com.java.designpattern.factorydesignpattern;

public class FactoryGenerator {

    public OS getInstance(String str) {
        if (str.equalsIgnoreCase("open"))
            return new Windows();
        else
            return new IOS();
    }
}
