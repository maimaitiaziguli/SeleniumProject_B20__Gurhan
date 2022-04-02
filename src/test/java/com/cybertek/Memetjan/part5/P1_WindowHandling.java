package com.cybertek.Memetjan.part5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P1_WindowHandling {
    /*
    TC5 # : Window Handle practice
    1. Create a new class called: WindowHandlePractice
    2. Create new test and make set ups
    3. Go to : http://practice.cybertekschool.com/windows
    4. Assert: Title is “Practice”
    5. Click to: “Click Here” text
    6. Switch to new Window.
    7. Assert: Title is “New Window”
     */

    WebDriver driver;
    @BeforeMethod
    public void setUpBrowser(){
        //    1. Create a new class called: WindowHandlePractice
        //    2. Create new test and make set ups
        //    3. Go to : http://practice.cybertekschool.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void windowHandle_Test1(){

        //    4. Assert: Title is “Practice”

        //    6. Switch to new Window.
        //    7. Assert: Title is “New Window”
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Practice";
        Assert.assertEquals(actualTitle,expectedTitle,"Verification is complete,Title is not Practice.");
    }

    @Test
    public void windowHandle_Test2(){
        //    5. Click to: “Click Here” text
        //    6. Switch to new Window.

        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickHereTextLink = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        clickHereTextLink.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



        Set<String> windowHandles = driver.getWindowHandles();

        for (String eachWindow:windowHandles){
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle());

        }

        //  7. Assert: Title is “New Window”
        String titleAAfterClick = driver.getTitle();
        System.out.println("titleAAfterClick = " + titleAAfterClick);
        String expectedTitle = "New Window";

        Assert.assertTrue(titleAAfterClick.equals("New Window"),"Verification is complete, Failed");






    }


}
