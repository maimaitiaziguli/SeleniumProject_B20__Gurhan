package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Cybertek_URL_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        String expected = "cybertekschool";
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains(expected)){
            System.out.println("Url verification is PASSED");
        }else {
            System.out.println("Url verification is FAILED");
        }


        String expectedTitle = "practice";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is FAILED");
        }

driver.quit();

    }
}
