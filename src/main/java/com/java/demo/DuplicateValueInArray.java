package com.java.demo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInArray {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 1, 3, 1};

        Set set = new HashSet();

        for(int i = 0; i<a.length; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }else {
                System.out.println(a[i]);
            }
        }
    }

}
