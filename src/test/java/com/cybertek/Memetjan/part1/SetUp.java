package com.cybertek.Memetjan;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String actualTitle1 = "";
        String actualTitle2 = "";
        String actualTitle3 = "";

        String actualUrl1 = "";
        String actualUrl2 = "";
        String actualUrl3 = "";

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        actualTitle1 = driver.getTitle();
        System.out.println(actualTitle1);
        actualUrl1 = driver.getCurrentUrl();
        Thread.sleep(1000);



        driver.get("https://www.apple.com");
        Thread.sleep(2000);
         actualTitle2 = driver.getTitle();
        System.out.println("actualTitle2 = " + actualTitle2);

actualUrl2 = driver.getCurrentUrl();
        System.out.println("actualUrl2 = " + actualUrl2);
        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
actualTitle3 = driver.getTitle();
        System.out.println("actualTitle3 = " + actualTitle3);
        actualUrl3 = driver.getCurrentUrl();
        System.out.println("actualUrl3 = " + actualUrl3);
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();


        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);
        driver.manage().window().fullscreen();

       // String sourcePase = driver.getPageSource();
       // System.out.println("sourcePase = " + sourcePase);

        driver.navigate().refresh();
       // driver.wait(1);

        System.out.println("Driver:    ===>  "+driver.toString());
       // System.out.println(driver.getText());
        driver.quit();
//driver.close();


/*
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Please handle the exception");
        }

 */

//driver.close();


    }
}
