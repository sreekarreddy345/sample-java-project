package com.java.exception;

public class UserDefinedException extends Exception {
    String str1;

    UserDefinedException(String message) {
        str1 = message;
    }

    @Override
    public String toString() {
        return "An Exception Occurred - " + str1;
    }
}
