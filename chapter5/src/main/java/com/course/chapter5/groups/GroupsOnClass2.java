package com.course.chapter5.groups;

import org.testng.annotations.Test;
//类分组
@Test(groups = "stu")
public class GroupsOnClass2 {

    public  void stu1(){
        System.out.println("GroupsOnClass2中的stu1运行啦");
    }
    public  void stu2(){
        System.out.println("GroupsOnClass2中的stu2运行啦");
    }
}
