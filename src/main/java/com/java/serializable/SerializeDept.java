package com.java.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDept {
    public static void main(String[] args) {
        Department dept = new Department("sreekar", 1, 10000, "835 Paisley CT");

        //serializable
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/main/resources/serialize/serializedDept.txt");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(dept);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //deserializable
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/resources/serialize/serializedDept.txt");
            ObjectInputStream os = new ObjectInputStream(fileInputStream);
            Department readDept = (Department) os.readObject();

            System.out.println(readDept);
            System.out.println(readDept.getAddress());
            System.out.println(readDept.getName());
            System.out.println(readDept.getId());
            System.out.println(readDept.getSalary());// salary will be 0 since that variable is declared as transient.

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
