package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");


        // get to header text

       // String actualHeader = driver.findElement(By.className("page-header")).getText();

        String actualHeader = driver.findElement(By.tagName("h3")).getText();
        String expectedHeader = "Log in to ZeroBank";
if (actualHeader.equals(expectedHeader)){
    System.out.println("Header verification is PASSED");
}else{
    System.out.println("Header verification is FAILED");
}
        Thread.sleep(3000);



String atribute = driver.findElement(By.id("user_login")).getText();
        System.out.println("id attribute is :" + atribute);
        driver.close();




    }
}
