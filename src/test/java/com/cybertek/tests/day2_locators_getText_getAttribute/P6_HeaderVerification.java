package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

/*
TC #6: Zero Bankheader verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify header text
Expected: “Log in to ZeroBank”
 */
public static void main(String[] args) {

 //TC #6: Zero Bankheader verification
    //1.Open Chrome browser
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();


    //2.Go to http://zero.webappsecurity.com/login.html
    driver.get("http://zero.webappsecurity.com/login.html");


    //3.Verify header text
    //Expected: “Log in to ZeroBank”
    // locate the header
    // get the text of the header

String actualText = driver.findElement(By.tagName("h3")).getText();
String ecpectedText = " log in to ZeroBank";
if (actualText.equals(actualText)){
    System.out.println("Header verification passed");
}else {
    System.out.println("Header verification failed");
}





}

}
