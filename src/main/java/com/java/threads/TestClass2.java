package com.java.threads;

import org.testng.annotations.Test;

public class TestClass2 {

    @Test
    public static void method3() throws InterruptedException {
        DeadLockExample.method1();
        DeadLockExample.method1();
        DeadLockExample.method2();
        DeadLockExample.method2();

    }

    @Test
    public static void method4() throws InterruptedException {
        DeadLockExample.method1();
        DeadLockExample.method1();
        DeadLockExample.method2();
        DeadLockExample.method2();
    }


}
