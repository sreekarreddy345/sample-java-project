package com.java.listimplementation.arraylist;

public class ListDemo3 {

    public static void main(String[] args) {


//        CustomArrayList list = new CustomArrayList();
        ArrayListImplementation<String> list = new ArrayListImplementation();
        ArrayListImplementation<String> list1 = new ArrayListImplementation(10);

        System.out.println("isEmPty - " + list.isEmpty());
        System.out.println("ListMethods Size - " + list.size());
        list.add("sree");
        list.add("sreekar");
        list.add("reddy");
        list.add("hi");
        list.add("hello");
        list.add("sree");
        System.out.println("isEmPty - " + list.isEmpty());
        System.out.println("ListMethods Size - " + list.size());
        list.add("Reddy");
        list.add("String");
        list.add("Value");
        list.add("Demo");
        list.add("ListMethods");
        list.add("sree2");
        list.add("sree3");
        list.add(20);
        list.add(20.22);
        list.add(33.9f);
        list.add("sree4");
        list.add("sree5");
        list.add("sree6");
        list.add("sree7");
        System.out.println("Get value - " + list.get(6));
    }

}
