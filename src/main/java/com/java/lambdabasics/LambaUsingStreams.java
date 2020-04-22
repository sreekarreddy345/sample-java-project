package com.java.lambdabasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambaUsingStreams {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        people.stream()
                .filter(p -> p.getFirstName().startsWith("C"))
                .filter(p -> p.getLastName().startsWith("B"))
                .forEach(System.out::println);
        System.out.println();

        List<Person> filtered = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(filtered);

        Stream<Person> stream = people.stream();
        boolean b1 = people.stream().filter(s -> s.getLastName().startsWith("C")).allMatch(person -> person.getFirstName().startsWith("L"));
        boolean b = people.stream().anyMatch(s -> s.getFirstName().equalsIgnoreCase(s.getLastName()));
        List<String> stringStream = people.stream().map(Person::getFirstName).collect(Collectors.toList());
       people.stream().filter(s -> s.getFirstName().startsWith("C")).forEach(System.out::println);
        Vector<String> c = people.stream().filter(s -> s.getFirstName().startsWith("C")).map(Person::getLastName).
                collect(Collectors.toCollection(Vector::new));

        Optional<Person> c1 = people.stream().findAny().filter(s -> s.getFirstName().startsWith("C"));
        Optional<Person> c2 = people.stream().findFirst().filter(s -> s.getFirstName().startsWith("C"));

        StringBuilder sb = new StringBuilder(); // not synchronised
        StringBuffer sb1 = new StringBuffer("sree");// all the methods in it are synchronised
    }
}
