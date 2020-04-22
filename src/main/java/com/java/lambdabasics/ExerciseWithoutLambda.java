package com.java.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseWithoutLambda {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name

        Collections.sort(people, new Comparator<Person>() {

            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        //step 2 : Print all elements in the list
        System.out.println("All elements in the list");
        printAll(people);

        //step :3 print people that have last start name starting with c
        System.out.println("People that have last start name starting with c");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        System.out.println();

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
