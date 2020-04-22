package com.java.exception;

public class UserDefinedExceptionImplementation {
    public static void main(String[] args) {
        try {

            throw new UserDefinedException("Custom Exception Message");

        } catch (UserDefinedException e) {
            System.out.println("catch Block");
            System.out.println(e);
        }

    }
}
