package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod是在测试方法之前运行的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在测试方法之后运行的方法");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
