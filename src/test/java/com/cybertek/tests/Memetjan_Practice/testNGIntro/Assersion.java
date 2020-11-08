package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assersion {
    @Test
    public void test1(){
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "Testdj";

        Assert.assertTrue(str1.equals(str2));


    }
    @Test
    public void test2(){
        String str1 = "TestNG";

        String str3 = "Testdj";
        Assert.assertTrue(str1.equals(str3),"str1 is not equal str3");

    }

    @Test
    public void test3(){

        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "Testdj";

        Assert.assertEquals(str1,str2,"str1 is not equal to str2");

    }


}
