package com.course.chapter5;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000) //单位为毫秒值
    public void sucTest() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000) //单位为毫秒值
    public void failTest() throws InterruptedException {
        Thread.sleep(4000);
    }
}
