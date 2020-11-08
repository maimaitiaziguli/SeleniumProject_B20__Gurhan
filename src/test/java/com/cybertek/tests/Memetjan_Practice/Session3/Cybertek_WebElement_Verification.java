package com.cybertek.tests.Memetjan_Practice.Session3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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



public class Cybertek_WebElement_Verification {
    public static void main(String[] args) {

     //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or
        //    CSS locator only (total of 6)
        //a. “Home” link  ( CSS Selector)
         WebElement homeText = driver.findElement(By.cssSelector("li[class='nav-item']"));
        System.out.println("1) Home link text is : " +homeText.getText());

        //b. “Forgot password” header  ( XPATH )
        WebElement forgotPasswordText = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println("2) Forgot password text is :" + forgotPasswordText.getText());

          //c. “E-mail” text (CSS Selector)
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("3) Email text is: " + emailText.getText());

        //d. E-mail input box (XPATH)
WebElement searchBoxText = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("4) Search box text is: " + searchBoxText.getText());

        //e. “Retrieve password” button (CSS Selector)
        WebElement retrievePasswordText = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("5) Retrieve Password Text is: " + retrievePasswordText.getText());


        //f. “Powered by Cybertek School” text  (XPATH)
        WebElement cybertekSchoolText = driver.findElement(By.xpath("//div[contains(@style,'text-align: center;')]"));
        System.out.println("6) Cybertek School Text : " + cybertekSchoolText.getText());


        //4. Verify all WebElements are displayed.
        if (homeText.isDisplayed()){
            System.out.println("Home text is displayed!");
        }else{
            System.out.println("Home text is not displayed!");
        }

        if (forgotPasswordText.isDisplayed()) {
            System.out.println("Forgot Password Text is displayed");
        }else{
            System.out.println("Forgot Password Text is not displayed");
        }
        if (emailText.isDisplayed()){
            System.out.println("Email text is displayed !");
        }else{
            System.out.println("Email text is not displayed !");
        }
        if (retrievePasswordText.isDisplayed()){
            System.out.println("Retrieve Password Text is displayed");
        }else {
            System.out.println("Retrieve Password Text is not  displayed");

        }

        if (cybertekSchoolText.isDisplayed()){
            System.out.println("Cybertek School Text is displayed");
        }else {
            System.out.println("Cybertek School Text is not displayed");

        }


        //Better if you do with both XPATH and CSS selector for practice purposes.




driver.close();









    }


}
