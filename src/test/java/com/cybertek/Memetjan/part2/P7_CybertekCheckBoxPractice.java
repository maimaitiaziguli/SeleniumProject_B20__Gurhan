package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P7_CybertekCheckBoxPractice {
    public static void main(String[] args) throws InterruptedException{
     /*

    // Practice: Cybertek Checkboxes
    //1. Go to http://practice.cybertekschool.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.
      */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
        if (!checkBox1.isSelected()){
            System.out.println("Check box 1 is not selected, Test PASSED");
        }else {
            System.out.println("Check box 1 is selected, Test FAILED");
        }


        WebElement checkBox2 = driver.findElement(By.cssSelector("#box2"));

        if (checkBox2.isSelected()){
            System.out.println("Check box2 is selected, Test PASSED");
        }else {
            System.out.println("Check box 1 is not selected, Test FAILED");

        }


        checkBox1.click();
        checkBox2.click();

        if (checkBox1.isSelected()){
            System.out.println("Check box 1 is selected, Test PASSED");
        }else {
            System.out.println("Check box 1 is not selected, Test FAILED");
        }


        if (!checkBox2.isSelected()){
            System.out.println("Check box2 is not selected, Test PASSED");
        }else {
            System.out.println("Check box2 is selected, Test FAILED");

        }

//driver.quit();





    }
}
