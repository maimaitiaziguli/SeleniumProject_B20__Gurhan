package com.cybertek.tests.Memetjan_Practice.Session3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkboc_Practice {

    public static void main(String[] args) {

        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        //2. Confirm checkbox #1 is NOT selected by default
        //3. Confirm checkbox #2 is SELECTED by default.
        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.



        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");


        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));

       if (checkBox1.isSelected()){
             System.out.println("checkBox1 is selected");
        }else {    System.out.println("checkBox1 is not selected, Verification is PASSED");
}

       //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        if (checkBox2.isSelected()){
            System.out.println("checkBox1 is selected, Verification is PASSED!");
        }else {    System.out.println("checkBox2 is not selected");
        }


        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        if (checkBox1.isSelected()){
            System.out.println("Check Box1 is selected. Verification PASSED.");
        }else{
            System.out.println("Check Box1 is selected");

        }
        //7. Confirm checkbox #2 is NOT selected.
if (checkBox2.isSelected()){
    System.out.println("Check Box2 is selected");

}else{
    System.out.println("Check Box2 is not selected. Verification PASSED");

}




driver.close();


    }
}
