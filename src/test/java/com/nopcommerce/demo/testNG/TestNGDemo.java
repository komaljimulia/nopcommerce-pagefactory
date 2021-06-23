package com.nopcommerce.demo.testNG;

import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I m in before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I m in after method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I m in before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I m in after test");
    }
    @Test
    public void test1(){
        System.out.println("I m in test 1");
    }
    @Test
    public void test2(){
        System.out.println("I m in test 2");
    }
}
