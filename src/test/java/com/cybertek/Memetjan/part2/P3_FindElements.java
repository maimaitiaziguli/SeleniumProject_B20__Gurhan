package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_FindElements {
    public static void main(String[] args)throws InterruptedException {
    /*
    TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        4. print all the links
        5. print how many total links
     */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        Thread.sleep(2000);

       List<WebElement>  listOfLinks = driver.findElements(By.xpath("//body//a"));
       for (WebElement eachLink :listOfLinks){
           System.out.println(eachLink.getText());
       }

       int linkSize = listOfLinks.size();
        System.out.println("linkSize = " + linkSize);


driver.quit();

    }
}
