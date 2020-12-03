package com.course.chapter5.groups;

import org.testng.annotations.Test;
//类分组
@Test(groups = "stu")
public class GroupsOnClass1 {


    public  void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行啦");
    }
}
