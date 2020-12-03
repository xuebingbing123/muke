package com.course.chapter5.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    //在每个测试套件运行之前运行（一个套件可能包含多个类）
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite运行啦！");
    }

    //在每个测试套件运行之后运行（一个套件可能包含多个类）
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行啦！");
    }

    //整个测试类开始前, 被执行, 主要用户塞值, 或者进行mock(Object)的初始化, 此方法只会运行一次
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest运行啦！");
    }
    //整个测试类开始后被执行
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest运行啦！");
    }
}
