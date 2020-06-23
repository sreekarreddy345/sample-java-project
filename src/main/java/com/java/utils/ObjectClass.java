package com.java.utils;

import com.java.pojo.Employee;

import java.util.HashSet;
import java.util.Set;

public class ObjectClass {
    public static void main(String[] args) {
        Employee employee = new Employee(8020, "sreekar", 27);
        Employee employee1 = new Employee(8021, "sreekar", 27);
        Employee employee2 = new Employee(8022, "sreekar", 27);
        Employee employee3 = new Employee(8023, "sreekar", 27);

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(employee);
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        for (Employee e : employeeSet) {
            System.out.println(e);
        }

    }
}
