package com.course.chapter5;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }
//
//    @Test
//    public void testCase2(){
//        System.out.println("Test这是测试用例2");
//    }
//
//    //在每个Test前执行，和@BeforeTest的主要区别在于, 你如果需要每次清空你测试的一些上下文, 那么需要配合@AfterMethod一起使用
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("BeforeMethod在测试方法之前运行！");
//    }
//
//    //在每个Test之后执行
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("AfterMethod在测试方法之后运行！");
//    }
//
//    //在每个类运行之前运行
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("BeforeClass在类运行之前运行的方法！");
//    }
//
//    //在每个类运行之后运行
//    @AfterClass
//    public void afterClass(){
//        System.out.println("AfterClass在类运行之后运行的方法！");
//    }
//
//    //在每个测试套件运行之前运行（一个套件可能包含多个类）
//    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("BeforeSuite在类运行之前运行的方法！");
//    }
//
//    //在每个测试套件运行之后运行（一个套件可能包含多个类）
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("AfterSuite在类运行之后运行的方法！");
//    }
//
//    //整个测试类开始前, 被执行, 主要用户塞值, 或者进行mock(Object)的初始化, 此方法只会运行一次
//    @BeforeTest
//    public void beforeTest(){
//        System.out.println("BeforeTest运行啦！");
//    }
//    //整个测试类开始后被执行
//    @AfterTest
//    public void afterTest(){
//        System.out.println("AfterTest运行啦！");
//    }

}
