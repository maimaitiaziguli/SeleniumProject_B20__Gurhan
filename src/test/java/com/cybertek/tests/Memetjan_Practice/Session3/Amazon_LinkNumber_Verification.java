package com.cybertek.tests.Memetjan_Practice.Session3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_LinkNumber_Verification {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        //WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
searchBox.sendKeys("wooden spoon" + Keys.ENTER);

String actualTitle = driver.getTitle();
String expectedTitle = "wooden spoon";

if (actualTitle.contains(expectedTitle)){
    System.out.println("Title verification is PASSED");
}else{
    System.out.println("Title verification is FAILED");
}


    }
}
