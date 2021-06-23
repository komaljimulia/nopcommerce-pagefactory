package com.nopcommerce.demo.testNG;

import com.nopcommerce.demo.pages.HomePage;
import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"Sanity","regression"})
    public void loginTest1(){System.out.println("running test-logintest1"); }
    @Test(groups = {"Sanity","smoke","regression"})
    public void loginTest2(){
        System.out.println("running test-logintest2");
    }
    @Test(groups = {"smoke","regression1","regression"})
    public void loginTest3(){
        System.out.println("running test-logintest3");
    }
    @Test(groups = {"smoke","regression1","regression"})
    public void loginTest4(){
        System.out.println("running test-logintest4");
    }
    @Test(groups = {"regression1","regression"})
    public void regression1(){
        System.out.println("running test-regression1");
    }
    @Test(groups = {"regression1","regression"})
    public void computerTest1(){
        System.out.println("running test-computertest1");
    }
    @Test(groups = {"regression1","regression"})
    public void computerTest2(){
        System.out.println("running test-computertest2");
    }


}
