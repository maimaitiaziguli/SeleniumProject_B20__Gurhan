package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P5_SelectingValueFromNonSelectingDropdown {


    //  TC#1: selecting value from non select dropdown
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3.click non select dropdown
//4. select Facebook from dropdown
//5. verify title is "Facebook-Log In or Sign Up"


    WebDriver driver;
 @BeforeMethod

     //1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
     public void setUpBrowser(){
         driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/dropdown");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

 }


 @Test
    public void nonSelectDropdown_test()throws InterruptedException{
     WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
     nonSelectDropdown.click();
     Thread.sleep(2000);
     WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
     facebookLink.click();
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     String actualTitle = driver.getTitle();
     System.out.println("actualTitle = " + actualTitle);
     String expectedTitle = "Facebook - Log In or Sign Up";
     Assert.assertEquals(actualTitle,expectedTitle);

 }

 @AfterMethod
    public void closingBrowser(){
    driver.quit();
 }


}
