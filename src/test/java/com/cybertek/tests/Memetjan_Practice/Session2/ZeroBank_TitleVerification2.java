package com.cybertek.tests.Memetjan_Practice.Session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_TitleVerification2 {


    public static void main(String[] args) {


        // set up the driver
        WebDriverManager.chromedriver().setup();

        // open chrome browser
        WebDriver driver = new ChromeDriver();

        // open the link
        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();


        // get the actual link
        String actualHref = driver.findElement(By.linkText("Zero Bank")).getAttribute("href");

        System.out.println(actualHref);

        String expectedHref = "/index.html";

        // create if condition to do verification

        if (actualHref.contains(expectedHref)){
            System.out.println("Link text verification is PASSED");
        }else{
            System.out.println("Link text verification is FAILED");
        }

driver.close();


    }
}
