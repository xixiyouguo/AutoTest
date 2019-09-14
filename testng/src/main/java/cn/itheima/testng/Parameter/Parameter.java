package cn.itheima.testng.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

public class Parameter {

    @Test
    @Parameters({"age","name"})
    public void test(String name, String age){
        System.out.println("name="+name+"; age="+age);
    }
}
