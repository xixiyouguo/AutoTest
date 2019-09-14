package cn.itheima.testng;

import org.testng.annotations.Test;

public class Depend {

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }
}
