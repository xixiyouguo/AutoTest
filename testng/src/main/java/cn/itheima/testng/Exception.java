package cn.itheima.testng;

import org.testng.annotations.Test;

public class Exception {

    @Test(expectedExceptions = RuntimeException.class)
    public void test(){
        System.out.println("预期发生runtime异常");
        int i = 1/0;
    }
}
