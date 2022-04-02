package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_CybertekWebLinksVerification {
    public static void main(String[] args) throws InterruptedException{
        /*

// TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or
//    CSS locator only (total of 6)
//a. “Home” link
//b. “Forgot password” header
//c. “E-mail” text
//d. E-mail input box
//e. “Retrieve password” button
//f. “Powered by Cybertek School” text
//4. Verify all WebElements are displayed.
//Better if you do with both XPATH and CSS selector for practice purposes.

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();
        Thread.sleep(2000);


       WebElement homeLink = driver.findElement(By.cssSelector("a[class=\"nav-link\"]"));
       if (homeLink.isDisplayed()){
           System.out.println("HomeLink is displayed, Test PASSED ");
       }else {
           System.out.println("HomeLink is not displayed, Test FAILED ");
       }

      // String actualHeaderText =driver.findElement(By.xpath("/html/body/div/div/div/div/h2")).getText();//absolute XPath
        WebElement actualHeaderText =driver.findElement(By.xpath("//h2[.=\"Forgot Password\"]"));
       //String expectedHeaderText = "Forgot password";
       if (actualHeaderText.isDisplayed()){
           System.out.println("Forgot password Header verification is complete, Test PASSED.");
       }else{
           System.out.println("Forgot password Header verification is complete, Test FAILED.");
       }

       // locate "E-mail" link and retrieving the text
       //String actualEmailText =  driver.findElement(By.cssSelector("label[for=\"email\"]")).getText();// cssSelector
      // String actualEmailText =  driver.findElement(By.xpath("//label[@for=\"email\"]")).getText();// Xpath
      // String actualEmailText =  driver.findElement(By.xpath("//label[contains(@for,\"email\")]")).getText();// XPath
       //String actualEmailText =  driver.findElement(By.xpath("//*[@for=\"email\"]")).getText();// XPath
       WebElement actualEmailText =  driver.findElement(By.xpath("//label[.=\"E-mail\"]"));// XPath
       // String expectedEmailText = "E-mail";

        if (actualEmailText.isDisplayed()){
            System.out.println("E-mail header verification is complete, Test PASSED.");
        }else {
            System.out.println("E-mail header verification is complete, Test FAILED.");
        }

        // E-mail input box
        // WebElement emailInputBox = driver.findElement(By.cssSelector("input[name=\"email\"]")); // cssSelector
       // WebElement emailInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]")); // xpath
        //WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@type,\"text\")]")); // xpath
        WebElement emailInputBox = driver.findElement(By.xpath("//*[(@type=\"text\")]")); // xpath

        if (emailInputBox.isEnabled()){
            System.out.println("E-mail Input Box verification is complete, Test PASSED" );
        }else{
            System.out.println("E-mail Input Box verification is complete, Test FAILED" );
        }

        //locating "Retrieve password" button and retrieving it's text
        // String actualRetrievePassword = driver.findElement(By.cssSelector("button[id=\"form_submit\"]")).getText();// cssSelector
       // String actualRetrievePassword = driver.findElement(By.cssSelector("button#form_submit")).getText(); // cssSelector
        //String actualRetrievePassword = driver.findElement(By.cssSelector("button.radius")).getText(); // cssSelector

        //String actualRetrievePassword = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText(); // xpath
       // String actualRetrievePassword = driver.findElement(By.xpath("//button[contains(@id,\"form_submit\")]")).getText(); // xpath
        //String actualRetrievePassword = driver.findElement(By.xpath("//i[.='Retrieve password']")).getText(); // xpath
        WebElement actualRetrievePassword = driver.findElement(By.xpath("//*[@class=\"icon-2x icon-signin\"]")); // xpath

       // String expectedRetrievePassword = "Retrieve password";

        if (actualRetrievePassword.isDisplayed()){
            System.out.println("Expected Retrieve Password verification is complete, Test PASSED.");
        }else {
            System.out.println("Expected Retrieve Password verification is complete, Test FAILED.");

        }

        WebElement poweredByCydeo = driver.findElement(By.xpath("//*[@style=\"text-align: center;\"]"));
        if (poweredByCydeo.isDisplayed()){
            System.out.println("powered By Cydeo verification is complete, Test PASSED");
        }else {
            System.out.println("powered By Cydeo verification is complete, Test PASSED");
        }


 driver.quit();


    }
}
