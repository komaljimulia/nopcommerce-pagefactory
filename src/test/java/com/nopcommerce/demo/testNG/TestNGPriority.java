package com.nopcommerce.demo.testNG;

import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(priority = 2)
    public void test1(){
        System.out.println("I m in test1");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("I m in test2");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("I m in test3");
    }
}
