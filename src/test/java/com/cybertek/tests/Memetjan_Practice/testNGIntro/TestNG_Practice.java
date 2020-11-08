package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practice {
    // 1 -  Go to google
    // 2 -  Verify title is google
    //
    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){

      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }



    // 1 -  Go to google
    @Test
    public void google_title_verification(){
     driver.get("https://google.com");

        // 2 -  Verify title is Google

        String expectyedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectyedTitle,actualTitle,"Titles are not matching");



    }
@AfterMethod
    public void tearDown() throws InterruptedException{
     Thread.sleep(3000);

       driver.close();
}


}
