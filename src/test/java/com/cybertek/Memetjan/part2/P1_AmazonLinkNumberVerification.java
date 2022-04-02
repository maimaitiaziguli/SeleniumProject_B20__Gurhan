package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1AmazonLinkNumberVerification {
    public static void main(String[] args) throws InterruptedException{
        /*
        / TC #3: Amazon link number verification
// 1. Open Chrome browser
// 2. Go to https://www.amazon.com
// 3. Enter search term (use cssSelector to locate search box)
// 4. Verify title contains search term
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // cssSelector ==>
        // syntax 1:
        // tagName[attribute='attributeValue']
      // WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
      //  WebElement searchBox = driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']"));


        // cssSelector ==>
        // syntax 2:
        // 1) tagName.classValue
       WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        // 2) tagName#idValue

       // WebElement searchBox = driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute"));
         // some time this does not work
        Thread.sleep(2000);
        searchBox.sendKeys("wood spoon"+ Keys.ENTER);

        driver.navigate().refresh();

    }
}
