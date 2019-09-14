package cn.itheima.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass2 {
    public void test1(){
        System.out.println("GroupsOnClass2中的teacher");
    }
}
