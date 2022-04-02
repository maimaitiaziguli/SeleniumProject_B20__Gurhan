package com.cybertek.Memetjan.part5;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P4 {
    WebDriver driver;

/*
    @BeforeMethod
    public void setUpBrowser(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void vyrackTest(){
        System.out.println("test is starting");
    }


 */
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        String filePath = "configuration.properties";
       FileInputStream file = new FileInputStream(filePath);
        properties.load(file);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("smartbearUrl"));



    }

}
