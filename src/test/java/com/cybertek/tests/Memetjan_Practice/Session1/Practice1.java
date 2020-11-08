package com.cybertek.tests.Memetjan_Practice.Session1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        System.out.println("The title of the page is : "+ actualTitle);

        String actualUrl = driver.getCurrentUrl();
        //System.out.println("CurrentUrl is: " + actualUrl);
        System.out.println("actualUrl = " + actualUrl);

        driver.navigate().back();

        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(1000);

//String pageSource = driver.getPageSource();
      //  System.out.println("pageSource = " + pageSource);

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

       String tostr = driver.navigate().toString();
        System.out.println("tostr = " + tostr);


    }
}
