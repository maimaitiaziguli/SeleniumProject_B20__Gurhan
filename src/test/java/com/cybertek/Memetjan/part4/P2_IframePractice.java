package com.cybertek.Memetjan.part4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P2_IframePractice {
    /*
    1. Create a new class called: IframePractice
    2. Create new test and make set ups
    3. Go to: http://practice.cybertekschool.com/iframe
    4. Assert: “Your content goes here.” Text is displayed.
    5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
     */
WebDriver driver;

    @BeforeMethod
    public void setUpBrowser(){
        // 1. Create a new class called: IframePractice
        // 2. Create new test and make set ups
        // 3. Go to: http://practice.cybertekschool.com/iframe

     driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void iframe_Test1 (){
     // 4. Assert: “Your content goes here.” Text is displayed.
    // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor

        // first of all locate the iframe and switch to the iframe
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(iframe);

// locate the the yourContentGoesHereMessage
        WebElement yourContentGoesHereMessage = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        String actualDisplayedIframeMessage = yourContentGoesHereMessage.getText();
        System.out.println("actualDisplayedIframeMessage = " + actualDisplayedIframeMessage);
        String expectedDisplayedIframeMessage = "Your content goes here.";

        Assert.assertEquals(actualDisplayedIframeMessage,expectedDisplayedIframeMessage);
    }
}
