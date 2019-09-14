package cn.itheima.testng.thread;

import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class ThreadAnno {

    @Test(invocationCount = 3,threadPoolSize = 3)
    public void test1(){
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }
}
