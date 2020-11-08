package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import org.testng.annotations.*;

public class TestNG1 {
   @BeforeClass
   public void setUpClass(){

       System.out.println("Before class is running");
   }

    @AfterClass
    public void tearDownClass(){
        System.out.println("AfterClass is running");
    }


    @BeforeMethod
    public void setUpMethod(){

        System.out.println("Before method is running");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod is running");
    }


 @Test
 public void test1(){

     System.out.println("Test1 is running");
 }

 @Test
    public void test2(){
     System.out.println("Test2 is running");

 }





}
