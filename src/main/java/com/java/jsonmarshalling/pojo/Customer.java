package com.java.jsonmarshalling.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement
public class Customer {

    private String name;
    private int age;
    private int id;

    public Customer() {
    }

    public Customer(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
//@by2877239b39