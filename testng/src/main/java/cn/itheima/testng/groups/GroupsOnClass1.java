package cn.itheima.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void test1(){
        System.out.println("GroupsOnClass1中的student");
    }
}
