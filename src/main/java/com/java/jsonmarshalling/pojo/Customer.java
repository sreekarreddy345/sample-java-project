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

}
