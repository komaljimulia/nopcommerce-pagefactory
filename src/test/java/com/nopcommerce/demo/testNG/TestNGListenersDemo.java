package com.nopcommerce.demo.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(TestNGListeners.class)
public class TestNGListenersDemo {
    @Test
    public void test1(){
        System.out.println("I m inside test1");

    }
    @Test
    public void test2(){
        System.out.println("I m inside test2");
        Assert.fail();
    }
    @Test
    public void test3(){
        System.out.println("I m inside test3");
        throw new SkipException("This test is skipped");
    }

}
