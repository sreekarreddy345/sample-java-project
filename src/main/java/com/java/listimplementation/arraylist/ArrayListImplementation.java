package com.java.listimplementation.arraylist;


public class ArrayListImplementation<T> {

    private Object data[];
    private int initialCapacity = 10;
    private int size = 0;

    public ArrayListImplementation() {
        data = new Object[initialCapacity];
    }

    public ArrayListImplementation(int initialCapacityPassed) {
        data = new Object[initialCapacityPassed];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Object value) {
        if (data.length == size) { // if data and size are equal we are increasing the arraylist size
            increaseCapacity();
        }
        data[size++] = value;

    }

    private void increaseCapacity() {
        Object temp[] = data;
        data = new Object[temp.length + ((temp.length) / 2)];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public Object get(int index) {
        return data[index];
    }

}



