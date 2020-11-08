package com.cybertek.tests.Memetjan_Practice.Session4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumEasy_Task1 {

    public static void main(String[] args) throws InterruptedException {



    //TC #2: SeleniumEasy Checkbox Verification – Section 1
    //1. Open Chrome browser
    //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // 3. Verify “Success – Check box is checked” message is NOT displayed.
    //4. Click to checkbox under “Single Checkbox Demo” section
    //5. Verify “Success – Check box is checked” message is displayed.


        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);




        // 3. Verify “Success – Check box is checked” message is NOT displayed.
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));
        if (!successMessage.isDisplayed()){
            System.out.println("“Success – Check box is checked” message is NOT displayed. Verification PASSED");
        }else{
            System.out.println("“Success – Check box is checked” message is displayed. Verification FAILED");

        }

        //4. Click to checkbox under “Single Checkbox Demo” section
        WebElement successCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        successCheckBox.click();

        //5. Verify “Success – Check box is checked” message is displayed.


        if (successCheckBox.isSelected()){
            System.out.println("“Success – Check box is checked” message is displayed. Verification PASSED");

        }else {
            System.out.println("“Success – Check box is checked” message is not displayed. Verification FAILED");

        }

Thread.sleep(10000);
        driver.close();







    }

}
