package com.java.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {


    public static void main(String[] args) {

        Map<String,String> stringStringMap = new HashMap<>();

        Map sampleMap = Collections.synchronizedMap(stringStringMap);

    }
}
