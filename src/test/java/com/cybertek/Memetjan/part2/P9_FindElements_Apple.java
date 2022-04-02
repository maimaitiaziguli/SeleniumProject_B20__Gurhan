package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P8_FindElements_Apple {
    public static void main(String[] args) {
      WebDriver driver;
      driver = WebDriverFactory.getDriver("chrome");
      driver.get("https://www.apple.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]")).click();
List<WebElement> listOfElements = driver.findElements(By.xpath("//body//a"));

        System.out.println("The size of listOfElements = " + listOfElements.size());


        // printing the links of missing text
        int count =0;
        for (WebElement eachList : listOfElements){
            if (!eachList.isDisplayed()){
                count++;
            }
        }

        System.out.println("The number of the missing text links are: " + count);


        int hasTextLinkCount =0;
        for (WebElement each :listOfElements){
            if (each.isDisplayed()){
                hasTextLinkCount++;
            }
        }

        System.out.println("hasTextLinkCount = " + hasTextLinkCount);

//       printing the text of the links
        for (WebElement eachList : listOfElements){
    System.out.println(eachList.getText());
}


    }
}
