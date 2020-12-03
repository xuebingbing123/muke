package com.course.chapter5.groups;

import org.testng.annotations.Test;
//类分组
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public  void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行啦");
    }

    public  void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行啦");
    }
}
