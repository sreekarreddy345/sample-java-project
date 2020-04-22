package com.java.demo;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
public class StringStringBufferStringBuilder {

    public static void main(String[] args) {
        stringBuffer();
        stringMethod();

        List<String> stringList = new ArrayList();

    }

    private static void stringMethod() {

        String string = "sample";
        for (int i = 0; i < 100; i++) {
            string += i;
        }
        String s = string.toString();
        //The above code would build 99 new String objects,
        // of which 98 would be thrown away immediately.
    }

    private static void stringBuffer() {
        StringBuffer stringBufffer = new StringBuffer(100);

        stringBufffer.append("sreekar - ");
        for (int i = 0; i < 100; i++) {
            stringBufffer.append(i);
        }
        String s = stringBufffer.toString();
    }
}
