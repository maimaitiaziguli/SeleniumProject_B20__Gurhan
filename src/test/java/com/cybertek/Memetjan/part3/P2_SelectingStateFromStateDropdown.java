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

public class P2_SelectingStateFromStateDropdown {

// TC#1: select state from "State dropdown" and verify the the result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. select Illinois
//4. select Virginia
//5. select California
//6. Verify final selected option is california
// Use all Select options (

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
       //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void selectingSate_test1(){

        //3. select Illinois
        //   select Virginia
        //   California
        //  Verify final selected option is California

        // first create a select class object than locate the dropdown and pass it to the object
        Select selectState = new Select(driver.findElement(By.id("state")));

        selectState.selectByVisibleText("Illinois");
        selectState.selectByValue("VA");
        selectState.selectByIndex(5);

       String actual = selectState.getFirstSelectedOption().getText();
       String expected = "California";

        Assert.assertEquals(actual,expected);
    }


    @AfterMethod
  public void closingTheTest(){
      driver.quit();
  }


}
