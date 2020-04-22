package com.java.serializable;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private int id;
    private transient int salary;// it is mentioned to make sure its not getting serialized stream

    public Department(String name, int id, int salary, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    private String address;


    public Department() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
