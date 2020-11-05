package com.java.exception;

public class UserDefinedException extends RuntimeException {
    String str1;

    public UserDefinedException() {
        super();
    }

    public UserDefinedException(String message) {
        super(message);
    }

    public UserDefinedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserDefinedException(Throwable cause) {
        super(cause);
    }

    protected UserDefinedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
