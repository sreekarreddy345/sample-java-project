package com.java.threads;

import org.testng.annotations.Test;

public class TestClass {

    @Test
    public static void method1() throws InterruptedException {
        DeadLockExample.method1();
        DeadLockExample.method1();
        DeadLockExample.method2();
        DeadLockExample.method2();
    }

    @Test
    public static void method2() throws InterruptedException {
        DeadLockExample.method1();
        DeadLockExample.method1();
        DeadLockExample.method2();
        DeadLockExample.method2();
    }


}
