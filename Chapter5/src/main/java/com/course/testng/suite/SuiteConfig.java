package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig
{
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite 运行");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite 运行");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest");
    }

}
