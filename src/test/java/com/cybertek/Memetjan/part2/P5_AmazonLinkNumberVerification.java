package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P5_AmazonLinkNumberVerification {
    public static void main(String[] args) throws InterruptedException{
     /*
     DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATOR
     / TC #3: Amazon link number verification
// 1. Open Chrome browser
// 2. Go to https://www.amazon.com
// 3. Enter search term (use cssSelector to locate search box)
// 4. Verify title contains search term
      */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
       searchBox.sendKeys("Uyghur"+ Keys.ENTER);

       String actualTitle = driver.getTitle();
       String expectedTitle = "Uyghur";

        System.out.println("actualTitle = " + actualTitle);

       if (actualTitle.contains(expectedTitle)){
           System.out.println("Title verification complete, Test PASSED");
       }else{
           System.out.println("Title verification complete, Test FAILED");

       }



    }
}
