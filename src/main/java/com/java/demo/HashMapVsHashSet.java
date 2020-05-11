package com.java.demo;

import java.util.*;

public class HashMapVsHashSet {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        Map<String, String> synchronizedMap = Collections.synchronizedMap(stringMap);// to make it synchronized map
        stringMap.put("1", "reddy");
        stringMap.put("2", "reddy");
        stringMap.put("3", "reddy");
        stringMap.put("4", "reddy");
        stringMap.put(null, "32");

        System.out.println("hashcode - " + stringMap.hashCode());

        // one - way
        iteratingHashMap(stringMap);

        // second - way
        iteratingHashMapUsingForEach(stringMap);

        //third way
        stringMap.forEach((K, V) -> System.out.println("foreach - " + K + ":" + V));


        Set<String> stringset = new HashSet<>();

        stringset.add("sreekar1");
        stringset.add("sreekar2");
        stringset.add("reddy3");
        stringset.add("reddy4");

        Iterator<String> iterator = stringset.iterator();
        while (iterator.hasNext()) {
            System.out.println("hashset iterate - " + iterator.next());
        }

        Map<String, String> map = new Hashtable<>();
        map.put("Key1", "value");
        map.put("Key1", "value");
        map.put("Key2", "value");
        map.put("Key3", "value");
        Iterator iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

    }

    private static synchronized void iteratingHashMapUsingForEach(Map<String, String> map) {
        for (Map.Entry entry : map.entrySet()) {

            String key = (String) entry.getKey();
            Object value = entry.getValue();
            System.out.println("forEach - " + key + " : " + value);
        }
        System.out.println();
    }

    private static void iteratingHashMap(Map<String, String> stringStringMap) {

        Iterator<Map.Entry<String, String>> iterator1 = stringStringMap.entrySet().iterator();

        while (iterator1.hasNext()) {
            Map.Entry<String, String> next = iterator1.next();
            System.out.println("entryy - " + next.getKey() + " : " + next.getValue());
        }
        System.out.println();
        Iterator iterator = stringStringMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            System.out.println("iterator - " + key + ":" + value);
        }
        System.out.println();
    }
}
