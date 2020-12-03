package com.course.chapter5.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    //方法分组
    @Test(groups = "server")
    public void test1(){
        System.out.println("server组test1执行");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server组test2执行");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("client组test3执行");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("client组test4执行");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("BeforeGroups在server组运行之前运行");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("AfterGroups在server组运行之后运行");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("BeforeGroups在client组运行之前运行");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("AfterGroups在client组运行之后运行");
    }
}
