package com.cybertek.Memetjan.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators{
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Exception is not handled");
        }finally {
            System.out.println("Exception is handled");
        }
        driver.manage().window().maximize();


        //driver.findElement(By.linkText("Images")).click();
       // Thread.sleep(2000);
//driver.findElement(By.linkText("Google Search")).click();
       // driver.findElement(By.linkText("Create an account"));

       // driver.findElement(By.partialLinkText("world")).click();


        driver.findElement(By.name("q")).sendKeys("Ezmet Peyzulla"+ Keys.ENTER);
        Thread.sleep(2000);



        //driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
