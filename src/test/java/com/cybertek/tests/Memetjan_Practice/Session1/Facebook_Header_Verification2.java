package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Header_Verification2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        String actualHref = driver.findElement(By.className("_8esh")).getAttribute("href");
        System.out.println("actualHref is : " + actualHref);


        String expectedHref = "registration_form";
        if (actualHref.contains(expectedHref)){
            System.out.println("Href value verification is PASSED");
        }else{
            System.out.println("Href verification is FAILED");
        }
        driver.close();




    }
}
