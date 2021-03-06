package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {

    // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    // 1. Open Chrome browser
    // 2. Go to http://practice.cybertekschool.com/dropdown
    // 3. Verify “Simple dropdown” default selected value is correct
    //      Expected: “Please select an option”
    // 4.  Verify “State selection” default selected value is correct
    //      Expected: “Select a State”


WebDriver driver;



    @BeforeMethod
    public void setUpMethod(){


        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


 @Test
 public void dropdown_test1() throws InterruptedException {


     // 3. Verify “Simple dropdown” default selected value is correct
     //      Expected: “Please select an option”

     Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
     String actualSelectedOption = simpleDropdown.getFirstSelectedOption().getText();
     String expectedSelectedOption = "Please select an option";

     Assert.assertEquals(actualSelectedOption,expectedSelectedOption);

     Thread.sleep(2000);
     simpleDropdown.selectByVisibleText("Option 2");



     // 4.  Verify “State selection” default selected value is correct
     //      Expected: “Select a State”
     Select stateDropdown = new Select(driver.findElement(By.id("state")));
     String actualStateDropdown = stateDropdown.getFirstSelectedOption().getText();
     String expectedresult = "Select a State";

     Assert.assertEquals(actualStateDropdown,expectedresult);

 }

}
