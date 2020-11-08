package com.cybertek.tests.Memetjan_Practice.Session3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FinfElements {
    public static void main(String[] args) {
        // open the chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLink:listOfLinks){
            System.out.println(eachLink.getText());
        }
        int numberOfLinks = listOfLinks.size();
        System.out.println(numberOfLinks);

    }
}
