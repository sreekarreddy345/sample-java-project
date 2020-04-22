package com.java.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface Condition {
    boolean test(Person person);
}

public class ExerciseWithLambda {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

//        step1 : Sort list by last name'
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));

//        step 2 : Print all elements in the list
        System.out.println("All elements in the list");
        print(people, p -> true, p -> System.out.println(p));

        //step :3 print people that have last start name starting with c
        System.out.println("People that have last start name starting with c");
        print(people, personLastName -> personLastName.getLastName().startsWith("C"), System.out::println);

        print(people, personFirstName -> personFirstName.getFirstName().startsWith("C"), person -> System.out.println(person.getFirstName()));

    }

    //use Predicate from java.util.function to use predefined functional interface in java and send the object type
    private static void print(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person person : people) {
            if (condition.test(person)) {
                consumer.accept(person);
            }
        }
        System.out.println();
    }
}
