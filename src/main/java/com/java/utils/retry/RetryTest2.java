package com.java.utils.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest2 {
    @Test
    public void Test1() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test2() {
        Assert.assertEquals(false, true);
    }
}