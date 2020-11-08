package com.cybertek.tests.Memetjan_Practice.Session3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
TC #3: PracticeCybertek/ForgotPassword URL verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password 3. Enter any email into input box
4. Click on Retrieve password
5. Verify URL contains:
Expected: “email_sent”
6. Verify textbox displayed the content as expected.
Expected: “Your e-mail’s been sent!”
Hint: You need to use getText method for this practice.
 */
public class CybertekLink_Verification {
    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification


       // 1. Open Chrome browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


      //  2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //  3. Enter any email into input box
        //driver.findElement(By.name("email")).sendKeys("michaelpee729@gmail.com");
        WebElement emailInputBos = driver.findElement(By.name("email"));
        emailInputBos.sendKeys("michaelpee729@gmail.com");

      //  4. Click on Retrieve password
        //driver.findElement(By.id("form_submit")).click();
        WebElement retievePasswordButton = driver.findElement(By.id("form_submit"));
        retievePasswordButton.click();


      //  5. Verify URL contains:
      //  Expected: “email_sent”
        String CurrentURL = driver.getCurrentUrl();
        String expectedURL = "email_sent";
        System.out.println("Current Url is: " + CurrentURL);

        if (CurrentURL.contains(expectedURL)){
            System.out.println("Url verification is PASSED");
        }else{
            System.out.println("Url verification is FAILED");
        }


      //  6. Verify textbox displayed the content as expected.
      //          Expected: “Your e-mail’s been sent!”


        //String actualTextBox = driver.findElement(By.name("confirmation_message")).getText();
        WebElement confermationMessge = driver.findElement(By.name("confirmation_message"));
        String actualTextBox = confermationMessge.getText();


        System.out.println(actualTextBox);
        String expectedTex ="Your e-mail's been sent!";

        if (actualTextBox.equals(expectedTex)){
            System.out.println("Header text value verification is PASSED");
        }else{
            System.out.println("Header text value verification is FAILED");
        }

      //  Hint: You need to use getText method for this practice.

        if (confermationMessge.isDisplayed()){
            System.out.println("Confermation messge is displayed. Verification is PASSED");
        }else {
            System.out.println("Confermation messge is not displayed. Verification is FAILED");
        }

driver.close();








    }
}
