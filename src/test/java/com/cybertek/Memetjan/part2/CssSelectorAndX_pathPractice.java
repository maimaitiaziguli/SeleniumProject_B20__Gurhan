package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorAndX_pathPractice {
    public static void main(String[] args)throws InterruptedException{

 /*
        / TC #3: Amazon link number verification
// 1. Open Chrome browser
// 2. Go to https://www.amazon.com
// 3. Enter search term (use X-path to locate search box)
// 4. Verify title contains search term
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
//XPath 1)
//WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));

//XPath 2
//WebElement searchBox = driver.findElement(By.xpath("//input[contains(@type,'text')]"));

//XPath 3
WebElement searchBox = driver.findElement(By.xpath("//*[@type='text']"));

searchBox.sendKeys("East Turkistan"+ Keys.ENTER);

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).click();
    }
}
