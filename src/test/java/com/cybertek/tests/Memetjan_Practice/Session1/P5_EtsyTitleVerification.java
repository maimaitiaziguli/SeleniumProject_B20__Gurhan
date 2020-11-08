package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+Keys.ENTER);

        Thread.sleep(3000);
        //driver.findElement(By.className("wt-input-btn-group__btn" )).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }




        driver.close();




    }


}
