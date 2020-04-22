package com.java.jsonmarshalling;

import com.java.jsonmarshalling.pojo.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToObjectExample {
    public static void main(String[] args) {

        File file = new File("./src/main/resources/xmlMessages/file.xml");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            System.out.println("file - " + file);

            Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
