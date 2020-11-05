package com.java.exception;

public class UserDefinedExceptionImplementation {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("Custom ExceptionDemo Message");
        } catch (UserDefinedException e) {
            e.printStackTrace();
            System.out.println("catch Block");
            System.out.println(e);
        }
    }
}