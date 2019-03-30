package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        System.out.println("beforeMethod是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在测试方法之后运行的");
    }
}
