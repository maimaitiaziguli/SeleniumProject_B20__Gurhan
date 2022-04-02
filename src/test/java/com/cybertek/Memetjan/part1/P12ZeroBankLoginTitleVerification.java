package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12ZeroBankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.navigate().back();
        Thread.sleep(2000);

       String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Zero-Account Summary";
        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }



    }
}
