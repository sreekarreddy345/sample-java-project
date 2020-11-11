package com.java.codingpoblems;

import lombok.val;

import java.util.HashMap;

public class TestExam {

    public static void main(String[] args) {

        HashMap<Integer, String>[] array = getArray("this is first sentence.this is second.And this is third.");
        for (HashMap<Integer, String> str : array) {
            System.out.println("str - " + str);
        }
    }


    public static HashMap<Integer, String>[] getArray(String str) {
        String[] sentences = str.split("\\.");   // split the string with "."

        val hashMap = new HashMap[sentences.length];

        for (int i = 0; i < sentences.length; i++) {

            HashMap<Integer, String> map = new HashMap<>();
            String[] words = sentences[i].split(" ");

            for (int j = 0; j < words.length; j++) {
                map.put(j, words[j]);
            }

            hashMap[i] = map;
        }
        return hashMap;


    }

}
