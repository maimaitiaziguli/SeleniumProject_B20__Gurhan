package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {
//TC #2: SeleniumEasy Checkbox Verification – Section 1
//1. Open Chrome browser
//2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// 3. Verify “Success – Check box is checked” message is NOT displayed.
//4. Click to checkbox under “Single Checkbox Demo” section
//5. Verify “Success – Check box is checked” message is displayed.


    public static void main(String[] args) {
        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement successCheckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));





        //3. Verify “Success – Check box is checked” message is NOT displayed.

        //4. Click to checkbox under “Single Checkbox Demo” section
        //5. Verify “Success – Check box is checked” message is displayed.


    }


}
