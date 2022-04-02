package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1GoogleTitleVerification {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();


        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");
        }

driver.quit();

    }
}
