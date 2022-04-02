package com.cybertek.Memetjan.part3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P7_SmartbearLoginMethod {


    public static void LoginToSmartbear(WebDriver driver){


        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        usernameInputBox.sendKeys("Tester");

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys("test");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

    }


}
