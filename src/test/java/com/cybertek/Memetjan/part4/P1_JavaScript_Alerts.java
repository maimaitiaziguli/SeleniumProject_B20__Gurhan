package com.cybertek.Memetjan.part4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P1_JavaScript_Alerts {
    /*
    1.open browser
    2. go to http://practice.cybertekschool.com/javascript_alerts
    3. click to "Click for JS Alert" button
    4. click to "Ok" button from the alert
    5. verify "You successfully clicked an alert" text is displayed
     */
    WebDriver driver;
    @BeforeMethod
    public void setUpBrowser(){

       // 1.open browser
      //  2. go to http://practice.cybertekschool.com/javascript_alerts
     driver = WebDriverFactory.getDriver("chrome");
     driver.get("http://practice.cybertekschool.com/javascript_alerts");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void cybertekJavaScriptAlert_Test1(){
        //    3. click to "Click for JS Alert" button
        WebElement JSAlertButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]"));
        JSAlertButton.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        System.out.println(successMessage.getText());

        Assert.assertTrue(successMessage.isDisplayed());

        String expected = "You successfully clicked an alert";
        String actual = successMessage.getText();
        Assert.assertEquals(expected,actual);

        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[2]"));
        confirmButton.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        alert.accept();

        String actualDisplayed = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        String expectedDisplayed = "You clicked: Ok";
        Assert.assertEquals(actualDisplayed,expectedDisplayed);

        WebElement promptButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[3]"));
        promptButton.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        alert.sendKeys("hello");
        alert.accept();

        WebElement displayedMessage = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String actualDisplayedMessage = displayedMessage.getText();
        String expectedDisplayedMessage = "You entered: hello";
        Assert.assertEquals(actualDisplayedMessage,expectedDisplayedMessage);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @AfterMethod
 public void closeBrowser(){
        driver.quit();
 }



}
