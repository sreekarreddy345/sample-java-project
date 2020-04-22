package com.java.lambdabasics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList
                (new Person("Charles", "Dickens", 60),
                        new Person("Lewis", "Carroll", 42),
                        new Person("Thomas", "Carlyle", 51),
                        new Person("Charlotte", "Bronte", 45),
                        new Person("Matthew", "Arnold", 39));
//      step:1 print all elements
        people.forEach(System.out::println);

        printConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println);
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition,
                                           Consumer<Person> consumer) {


        for (Person p : people) {
            if (condition.test(p))
                consumer.accept(p);
        }
    }
}

