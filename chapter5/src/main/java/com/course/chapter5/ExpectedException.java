package com.course.chapter5;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 什么时候会用到异常测试
     * 在我们期望结果为一个异常的时候
     * 比如：传入了某些不合法参数，程序抛出了异常
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExpectionFailed(){
        System.out.println("这是一个失败的异常测试！");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExpectionSuccess(){
        System.out.println("这是一个成功的异常测试！");
        throw new RuntimeException();
    }

}
