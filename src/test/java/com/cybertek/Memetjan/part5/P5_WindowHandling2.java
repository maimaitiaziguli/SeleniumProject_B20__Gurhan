package com.cybertek.Memetjan.part5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P5_WindowHandling2 {


    WebDriver driver;

    @BeforeMethod
    public void browserSetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void windowHandling_Test (){

        //THIS LINE IS BASICALLY : We are downcasting our driver type to JavaScriptExecutor
        // THe only thing this line is doing is USING JS EXECUTOR -> opening new tabs with given links
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        for (String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("Current page title: "+driver.getTitle());

            if (driver.getCurrentUrl().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
            }
        }







    }

    @AfterMethod
    public void closing(){
        driver.quit();
    }
}
