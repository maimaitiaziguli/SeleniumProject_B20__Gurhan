package com.cybertek.tests.Memetjan_Practice.Session3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class P4_PracticeCybertek_Xpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //driver.findElement(By.xpath("//button[@onclick='button2()']")).click();
        // relative XPATH practice -> passed

        //driver.findElement(By.xpath("//button[@name='button2']")).click();
        // relative XPATH practice -> passed

        //driver.findElement(By.xpath("//button[@id='button_btnbtn']")).click();
       // because id is dynamic , so we don't use id with XPATH

       // driver.findElement(By.xpath("//button[contains(@onclick,'button2()')]")).click();
       // relative XPATH practice -> passed

        //driver.findElement(By.xpath("//button[contains(@name, 'button2')]")).click();
        // relative XPATH practice -> passed

        //driver.findElement(By.xpath("//button[.='Button 3']")).click();
        // relative XPATH practice -> passed


        //driver.findElement(By.xpath("//*[@onclick='button4()']")).click();
        // relative XPATH practice -> passed

        //driver.findElement(By.xpath("//*[.='Button 4']")).click();
        // relative XPATH practice -> passed

       // driver.findElement(By.xpath("//*[contains(@onclick,'button5()' )]")).click();

        // Absolute XPATH
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[5]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

  driver.close();
    }
}
