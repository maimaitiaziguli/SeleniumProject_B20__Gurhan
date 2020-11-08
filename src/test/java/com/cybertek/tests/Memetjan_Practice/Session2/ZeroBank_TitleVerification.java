package com.cybertek.tests.Memetjan_Practice.Session2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_TitleVerification{

    public static void main(String[] args) {


        // set up the driver
        WebDriverManager.chromedriver().setup();

        // open chrome browser
        WebDriver driver = new ChromeDriver();

        // open the link
        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();


        //get the title of the page and store in a string
        String actualTitle = driver.getTitle();

        System.out.println("Actual title is : " + actualTitle);

        String expectedTile = "Zero - Log in";

        // create if condition to do the verification
        if (actualTitle.equals(expectedTile)){
            System.out.println("Title verification is PASSED");
        }else{
            System.out.println("Title verification is FAILED");
        }

        driver.close();

    }


}
