package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P10_FindElements_Apple2 {
    public static void main(String[] args) throws InterruptedException{


        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // clicking "Mac" header
        WebElement mac = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]"));
        WebElement ipad = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]"));
        WebElement iphone = driver.findElement(By.cssSelector("#ac-globalnav > div > ul.ac-gn-list > li.ac-gn-item.ac-gn-item-menu.ac-gn-iphone"));
        WebElement watch = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[6]"));
        mac.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String titleOfMacPage = driver.getTitle();

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

        System.out.println("listOfLinks: " +( listOfLinks.size()));
        System.out.println("titleOfMacPage = " + titleOfMacPage);

        int count =0;
        for (int i = 0; i <=12;i++){
            listOfLinks.get(i).click();
            Thread.sleep(1000);

        }
        System.out.println(count+" links have The title: "+titleOfMacPage);


        driver.quit();

    }
}
