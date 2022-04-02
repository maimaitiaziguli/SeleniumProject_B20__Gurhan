package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9FacebookHeaderVerification2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

       driver.manage().window().maximize();


       String expected = "registration_form";

       String actual = driver.findElement(By.className("_8esh")).getAttribute("href");

       if (actual.contains(expected)){
           System.out.println("Header verification PASSED");
       }else{
           System.out.println("Header verification FAILED");
       }





    }
}
