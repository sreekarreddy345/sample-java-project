package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class DeadLockExample {
// Not Working DeadLockExample refer to DeadLockExample2
    private final static Logger LOGGER = LoggerFactory.getLogger(DeadLockExample.class);


    public static void main(String[] args) throws InterruptedException {
        method1();
        method1();
    }

    public static void method1() throws InterruptedException {
        synchronized (Integer.class) {
            TimeUnit.SECONDS.sleep(1);
            LOGGER.info("Acquired lock on Integer.class object- - method 1");
        }
        synchronized (String.class) {
            TimeUnit.SECONDS.sleep(1);
            LOGGER.info("Acquired lock on String.class object- - method 1");
        }
    }

    public static void method2() throws InterruptedException {
        synchronized (Integer.class) {
            TimeUnit.SECONDS.sleep(1);
            LOGGER.info("Acquired lock lock on String.class Object - method 1");
            LOGGER.info("frsfsfsfsfs");
        }
        synchronized (String.class) {
            TimeUnit.SECONDS.sleep(1);
            LOGGER.info("Acquired lock on Integer.class Object - - method 1");
        }
    }

}
