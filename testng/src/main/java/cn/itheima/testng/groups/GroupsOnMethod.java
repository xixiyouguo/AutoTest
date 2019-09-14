package cn.itheima.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = {"server"})
    public void test1(){
        System.out.println("server111");
    }

    @Test(groups = {"server"})
    public void test2(){
        System.out.println("server222");
    }

    @Test(groups = {"client"})
    public void test3(){
        System.out.println("client111");
    }

    @Test(groups = {"client"})
    public void test4(){
        System.out.println("client222");
    }

    @BeforeGroups({"server","client"})
    public void beforeGroups(){
        System.out.println("server前的方法");
    }

    @AfterGroups({"server"})
    public void afterGroups(){
        System.out.println("server后的方法");
    }
}
