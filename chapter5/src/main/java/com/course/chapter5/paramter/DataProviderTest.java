package com.course.chapter5.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.management.ObjectName;
import java.lang.reflect.Method;

public class DataProviderTest {

    /**
     *@DataProvider(name="")
     *@Test(dataProvider="")
     * 实现参数化
     */
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }


    @DataProvider(name="data")
    public Object providerData(){
        Object obj = new Object[][]{
                {"zhangsan",10},
                {"lisi",10}
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法：name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法：name="+name+";age="+age);
    }

    @DataProvider(name="methodData")
    public Object methodProviderData(Method method){
        Object result = null;
        if("test1".equals(method.getName())){

            result=new Object[][]{
                    {"zhangsan",20},
                    {"lisi",21}
            };
        }else if("test2".equals(method.getName())){
            result=new Object[][]{
                    {"wangwu",22}
            };
        }
        return result;
    }
}
