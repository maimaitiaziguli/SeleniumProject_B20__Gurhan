package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Header_Verification {

    public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        String actualHeader = driver.findElement(By.className("_8eso")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
if (actualHeader.equals(expectedHeader)){
    System.out.println("Header verification PASSED");
}else{
    System.out.println("Header verification FAILED");
}

driver.close();

    }
}
