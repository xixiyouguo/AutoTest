package cn.itheima.testng.Parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void test1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] data(){
        Object[][] o = new Object[2][2];
//        {
//                {"zhangsan",18},
//                {"lisi",20}
//        };
        o[0][0] = "zhangsan";
        o[0][1] = 18;
        o[1][0] = "lisi";
        o[1][1] = 20;
        return o;
    }

    @Test(dataProvider = "method")
    public void test2(String name,int age){
        System.out.println("test222:name="+name+"; age="+age);
    }

    @Test(dataProvider = "method")
    public void test3(String name,int age){
        System.out.println("test333:name="+name+"; age="+age);
    }

    @DataProvider(name = "method")
    public Object[][] method(Method method){
        Object[][] o = null;
        if (method.getName().equals("test2")){
            o = new Object[][]{
                    {"wangwu",21},
            };
        }else if (method.getName().equals("test3")){
            o = new Object[][]{
                    {"zhaoliu",50},
            };
        }

        return o;
    }
}
