package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7FacebookTitleVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
Thread.sleep(2000);

driver.findElement(By.id("email")).sendKeys("abc123");
driver.findElement(By.id("pass")).sendKeys("123123Ab");
driver.findElement(By.name("login")).click();

String expectedTitle = "Log into Facebook | FaceBook";
String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title verification Passed");
        }else{
            System.out.println("title verification Failed");
            
        }










    }
}
