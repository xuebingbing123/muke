package com.course.chapter5.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    /**
     *
     * Parameters注解实现参数化
     *
     */
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
}
