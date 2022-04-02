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

public class P1_VerifyingSimpleDropdownAndStateSelection {
    // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Verify “Simple dropdown” default selected value is correct
//Expected: “Please select an option”
//4. Verify “State selection” default selected value is correct
//Expected: “Select a State”



        WebDriver driver;

      @BeforeMethod
      public void setUpMethod(){
          //setting up the driver and open chrome driver
          driver = WebDriverFactory.getDriver("chrome");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

         // 2. Go to http://practice.cybertekschool.com/dropdown
          driver.get("http://practice.cybertekschool.com/dropdown");
        }

        @Test
    public void dropdown_test_1 (){
            //3. Verify “Simple dropdown” default selected value is correct
            // Expected: “Please select an option”

            // create a select class object then locate the dropdown and pass to the select class object
            Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

            // get the the default option text
            String actualOption = simpleDropdown.getFirstSelectedOption().getText();
            String expectedOption = "Please select an option";

            // compare the actualOption with the expectedOption
            Assert.assertEquals(actualOption,expectedOption);


            //4. Verify “State selection” default selected value is correct
            //Expected: “Select a State”
            Select actualSelectedOption = new Select(driver.findElement(By.id("state")));

            // getting the default selected option text
            String actualSelectedOptionText = actualSelectedOption.getFirstSelectedOption().getText();
            String expectedSelectionOptionText = "Select a State";
            Assert.assertEquals(actualSelectedOptionText,expectedSelectionOptionText);



            //3. Verify “Simple dropdown” default selected value is correct
            //Expected: “Please select an option”

            // first create a select class object than locate the dropdown and pass it to the object
            Select actualSelectStateOption = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/select[5]")));

            String actualSelectStateOptionText =  actualSelectStateOption.getFirstSelectedOption().getText();
            System.out.println(actualSelectStateOptionText);
            String expectedSelectStateOptionText = "Select a State";
            Assert.assertEquals(actualSelectStateOptionText,expectedSelectStateOptionText);

        }

    @AfterMethod
    public void closing(){
          driver.quit();
     }


     @Test
    public void test_0(){
         System.out.println("Test 1 is completed!!!");
     }

}
