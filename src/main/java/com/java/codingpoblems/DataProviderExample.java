package com.java.codingpoblems;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethodCanHaveAnyName() {
        return new Object[][]{{"First-Value"}, {"Second-Value"}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest(String val) {
        System.out.println("Passed Parameter Is : " + val);
    }

}
