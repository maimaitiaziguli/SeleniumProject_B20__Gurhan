package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4GoogleSearch {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.className("gNO89b")).click();

        String expected = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expected)){
            System.out.println("Title verification Passed");
        }else {
            System.out.println("Title verification Failed");
        }

driver.quit();

    }
}
