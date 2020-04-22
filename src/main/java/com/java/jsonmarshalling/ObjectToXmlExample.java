package com.java.jsonmarshalling;

import com.java.jsonmarshalling.pojo.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ObjectToXmlExample {

    public static void main(String[] args) throws JAXBException {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setAge(24);
        customer.setName("sreekar");


        File file = new File("./src/main/resources/xmlMessages/file.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(customer, file);
//        jaxbMarshaller.marshal(customer, System.out);

    }
}

