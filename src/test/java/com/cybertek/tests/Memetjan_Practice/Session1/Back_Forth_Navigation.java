package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forth_Navigation {
    public static void main(String[] args ) throws InterruptedException {

        // first set up the chrome driver
        WebDriverManager.chromedriver().setup();

        //create the driver veriable
        WebDriver driver = new ChromeDriver();

        // get to the web page
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        // locate the web element Gmail
        driver.findElement(By.linkText("Gmail")).click();

Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else{
            System.out.println("Title verification is FAILED");
        }

        driver.navigate().back();
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Google";

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title verification 2 is PASSED");
        } else{
            System.out.println("Title verification 2 is FAILED");
        }








    }
}
