package com.course.chapter5.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
