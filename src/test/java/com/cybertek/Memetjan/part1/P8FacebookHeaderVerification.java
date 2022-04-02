package com.cybertek.Memetjan.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8FacebookHeaderVerification {
    public static void main(String[] args) throws InterruptedException{
        // first set up the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // open the webpage
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // verify the header is as expected
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        // find the actual header

String actualHeader = driver.findElement(By.className("_8eso")).getText();

if (expectedHeader.equals(actualHeader)){
    System.out.println("Header verification PASSED");
}else{
    System.out.println("Header verification FAILED");
}

driver.quit();



    }
}
