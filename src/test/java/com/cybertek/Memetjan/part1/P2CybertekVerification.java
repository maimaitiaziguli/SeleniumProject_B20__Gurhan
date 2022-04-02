package com.cybertek.Memetjan.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2CybertekVerification {
    public static void main(String[] args)throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
Thread.sleep(3000);

driver.findElement(By.id("details-button")).click();
Thread.sleep(3000);

driver.findElement(By.linkText("Proceed to practice.cybertekschool.com (unsafe)")).click();
Thread.sleep(3000);


        String expectedUrl = "cybertekschool";
        String expectedTitle = "Practice";

       String actualTitle =  driver.getTitle();
       String actualUrl = driver.getCurrentUrl();

       if (actualUrl.contains(expectedUrl)){
           System.out.println("Url verification passed");
       }else {
           System.out.println("Url verification failed");
       }

       if (actualTitle.equalsIgnoreCase(expectedTitle)){
           System.out.println("Title verification passed");
       }else{
           System.out.println("Title verification failed");
       }

       //driver.quit();

    }
}
