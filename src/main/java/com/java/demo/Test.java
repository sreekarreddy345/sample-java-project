package com.java.demo;


import java.util.ArrayList;
import java.util.List;

class AA {
    protected static String fruit = " Apple";
}

class BB extends AA {

}

public class Test {

    static int a = 1111;

    static {
        a = a-- - --a;
    }

    {
        a = a++ + ++a;
        int c = 1;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(BB.fruit);


        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        System.out.println(Math.min(Double.MIN_VALUE, 0.00d));
        System.out.println(Double.MIN_VALUE);
        System.out.println(a);
        String b = "efgh";
        String a = "abcd".concat(b);
        System.out.println(a);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");


        for (int i = 0; i < list.size(); i++) {
            if ("a".equals(list.get(i))) {
                list.remove(i);
            }
        }

        System.out.println(list);
//        for (String s : list) {
////            System.out.println(s);
//        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
////            System.out.println(s);
//        }
    }

}
