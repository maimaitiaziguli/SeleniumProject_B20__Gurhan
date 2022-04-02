package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P3_SelectingDateOnDropdown {

   //  TC#1: selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. select "December 1ST, 1921" and verify its selected.
// select year using visible text
// select month using value attribute
// select date using index number

WebDriver driver;

    @BeforeMethod
    public void setUpBrowser(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@Test
    public void selectingDate_test1(){
    System.out.println("Test is starting...");

    Select yearDropdown = new Select(driver.findElement(By.id("year")));
    Select monthDropdown = new Select(driver.findElement(By.id("month")));
    Select dateDropdown = new Select(driver.findElement(By.id("day")));

    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    yearDropdown.selectByVisibleText("1925");
    monthDropdown.selectByValue("11");
    dateDropdown.selectByIndex(0);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


    String expectedYear = "1925";
    String expectedMonth = "December";
    String expectedDate = "1";

    String actualSelectedYear = yearDropdown.getFirstSelectedOption().getText();
    String actualSelectedMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualSelectedDate = dateDropdown.getFirstSelectedOption().getText();

    Assert.assertEquals(actualSelectedYear,expectedYear);
    Assert.assertEquals(actualSelectedMonth,expectedMonth);
    Assert.assertEquals(actualSelectedDate,expectedDate);
}

@AfterMethod
    public void closingBrowser(){
    System.out.println("Test is completed, check the result");
    //driver.close();
}






}
