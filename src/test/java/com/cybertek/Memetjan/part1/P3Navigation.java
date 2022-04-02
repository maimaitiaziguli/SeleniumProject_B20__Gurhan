package com.cybertek.Memetjan.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3Navigation {
    public static void main(String[] args)throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification Failed");
        }


        driver.navigate().back();
        Thread.sleep(3000);

        String expectedResult ="Google";

        String actualResult = driver.getTitle();
        System.out.println(actualResult);
        if (actualResult.equals(expectedResult)){
            System.out.println("Title verification 2 passed");
        }else {
            System.out.println("Title verification 2 failed");
        }
        driver.close();
    }
}
