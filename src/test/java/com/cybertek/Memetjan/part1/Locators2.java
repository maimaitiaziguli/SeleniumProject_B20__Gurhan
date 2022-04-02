package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // we have already set up the chrome driver

        driver.get("https://www.etsy.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Wall Decor")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Shop this item")).click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);


        driver.findElement(By.partialLinkText("Dining")).click();
        Thread.sleep(1000);

        driver.navigate().back();

        driver.findElement(By.className("wt-text-caption-title wt-line-height-tight wt-text-center-xs wt-text-truncate--multi-line wt-text-black query-with-image-text wt-mb-xs-1 wt-show-xs wt-hide-lg")).click();

        Thread.sleep(1000);
        driver.navigate().back();
       // driver.quit();



    }
}
