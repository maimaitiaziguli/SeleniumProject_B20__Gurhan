package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

       String actualTitle =  driver.getTitle();
       String expectedTitle = "Google";

        System.out.println("Title is : "+ actualTitle);

       if(actualTitle.equalsIgnoreCase(expectedTitle)){
           System.out.println("Title verification is PASSED");
       }else{
           System.out.println("Title verification is FAILED");

       }





        driver.close();


    }
}
