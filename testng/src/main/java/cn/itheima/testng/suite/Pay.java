package cn.itheima.testng.suite;

import org.testng.annotations.Test;

public class Pay {

    @Test
    public void pay(){
        System.out.println("支付成功");
    }

    @Test(enabled = false)//该方法不会执行
    public void pay1(){
        System.out.println("再次支付成功");
    }
}
