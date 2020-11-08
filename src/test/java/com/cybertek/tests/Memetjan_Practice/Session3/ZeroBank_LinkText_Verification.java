package com.cybertek.tests.Memetjan_Practice.Session3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_LinkText_Verification {
    public static void main(String[] args) {

  //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        // 3. Verify link text from top left:
        //Expected: “Zero Bank”
        //4. Verify link href attribute value contains:
        //Expected: “index.html”



        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");


        // 3. Verify link text from top left:
        //Expected: “Zero Bank”
       WebElement actualLinkText1 = driver.findElement(By.className("brand"));
      String actualLinkText = actualLinkText1.getText();
      String expectedLinkText = "Zero Bank";

        // System.out.println("actualLinkText = " + actualLinkText);
        // System.out.println("expectedLinkText = " + expectedLinkText);
if (actualLinkText.equals(expectedLinkText)){
    System.out.println("Link text verification is Passed");
}else{
    System.out.println("Link text verification is Failed");
}



        //4. Verify link href attribute value contains:
        //Expected: “index.html”
String actualLinkAttribute = actualLinkText1.getAttribute("href");
String expectedLinkAttributeValue = "index.html";
        //System.out.println(actualLinkAttribute);

if (actualLinkAttribute.contains(expectedLinkAttributeValue)){
    System.out.println("Link text attribute verification is Passed");
}else{
    System.out.println("Link text attribute verification is Failed");
}
        driver.close();

    }
}
