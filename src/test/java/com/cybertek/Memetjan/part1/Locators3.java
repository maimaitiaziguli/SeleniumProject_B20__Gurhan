package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // set up the chrome driver


        driver.get("https://www.etsy.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();


//driver.findElement(By.name("search_query")).sendKeys("wood spoon"+ Keys.ENTER);
 //driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wood spoon"+ Keys.ENTER);
driver.findElement(By.tagName("input")).sendKeys("Wood spoon"+ Keys.ENTER);







    }
}
