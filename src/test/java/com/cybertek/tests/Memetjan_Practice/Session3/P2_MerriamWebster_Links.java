package com.cybertek.tests.Memetjan_Practice.Session3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {

    //TC #0: FINDELEMENTS
    //1. Open Chrome browser
    //2. Go to https://www.merriam-webster.com/
    // 3. Print out the texts of all links
    //4. Print out how many link is missing text
    //5. Print out how many link has text
    //6. Print out how many total link

    public static void main(String[] args) {

//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");


        // 3. Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLinks:listOfLinks){
           // System.out.println(eachLinks.getText());
        }
       // System.out.println(listOfLinks.size());


        //4. Print out how many link is missing text
        int LinksWithoutText = 0;
        int LinksWithText = 0;
        String emptyLinks ="";
        for (WebElement eachLinks:listOfLinks){
            String textOfLinks = eachLinks.getText();
           if (textOfLinks.isEmpty()){
               LinksWithoutText += 1;
           }else{
               LinksWithText += 1;
           }
        }
        System.out.println("Total empty link is: " + LinksWithoutText);
        System.out.println("Links with text : " + LinksWithText);

        //5. Print out how many link has text
        //6. Print out how many total link
        System.out.println(listOfLinks.size());

    }

}
