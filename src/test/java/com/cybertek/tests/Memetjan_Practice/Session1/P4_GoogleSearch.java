package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

      driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

      driver.findElement(By.name("btnK")).click();

      String expectedTitle = "apple";

      String actualTitle = driver.getTitle();


      if (actualTitle.contains(expectedTitle)){
          System.out.println("Title verification is PASSED");
      }else {
          System.out.println("Title verification is Failed");


      }





    }
}
