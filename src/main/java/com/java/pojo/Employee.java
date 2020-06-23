package com.java.pojo;

import java.util.Objects;

public class Employee {
    private int ssn;
    private String empName;
    private int empAge;

    public Employee() {
    }

    public Employee(int ssn, String empName, int empAge) {
        this.ssn = ssn;
        this.empName = empName;
        this.empAge = empAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ssn == employee.ssn &&
                empAge == employee.empAge &&
                empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, empName, empAge);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ssn=" + ssn +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                '}';
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}

class testEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpAge(20);
        e.setSsn(100);
        e.setEmpName("sreekar");

        Employee e1 = new Employee(1, "sreekar", 20);

    }
}
