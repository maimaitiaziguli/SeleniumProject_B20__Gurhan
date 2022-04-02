package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

if (actualHeader.equals(expectedHeader)){
    System.out.println("Header verification Passed");
}else {
    System.out.println("Header verification Failed");
}

    }
}
