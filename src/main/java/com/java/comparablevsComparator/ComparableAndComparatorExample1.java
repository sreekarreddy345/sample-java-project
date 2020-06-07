package com.java.comparablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorExample1 {

    public static void main(String[] args) {


        List<Student> list = new ArrayList<>(10);

        list.add(new Student(6, "Sreekar", 26));
        list.add(new Student(2, "Prathyusha", 27));
        list.add(new Student(4, "reddy", 24));

        Collections.sort(list);
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getStudentID() > s2.getStudentID()) {
                    return 1;
                } else
                    return -1;
            }
        };

        Collections.sort(list, com);


        for (Student a : list) {
            System.out.println(a);
        }

    }
}
