package com.course.chapter5;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public  void test1(){
        System.out.println("test1 run!");
        throw new RuntimeException();
    }
    /**
     *     依赖测试
     *     test2依赖test1执行
     *     如果test1运行失败，test2被忽略掉，不执行
     */

    @Test(dependsOnMethods = {"test1"})
    public  void test2(){
        System.out.println("test2 run!");
    }
}
