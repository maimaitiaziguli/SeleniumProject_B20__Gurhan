package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2FindElements {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
         //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //4. print all the links
        //5. pring how many total links

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        // locate the web element by XPath text
       // WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

       // locate the web element by xpath--> attribute and value
       // 1)  WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        // 2)WebElement homeLink = driver.findElement(By.xpath("//a[@href=\"/\"]"));

        // locate the web element by cssSelector --> tagName , attribute and value
       // WebElement homeLink = driver.findElement(By.cssSelector("a[href=\"/\"]"));

        // locate the web element by cssSelector --> by tagName.classValue
       // WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        //find the web element by linkText
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        System.out.println("homeLink = " + homeLink);

        // find the email link by cssSelector -> tagName , attribute and value
       // WebElement emailLink = driver.findElement(By.cssSelector("label[for=\"email\"]"));

        // find the email link by XPath -> tagName, attribute attributeValue
       //  WebElement emailLink = driver.findElement(By.xpath("//label[@for=\"email\"]"));

        // find the email link by XPath -> //tagName[.=’text’]
       // WebElement emailLink = driver.findElement(By.xpath("//label[.=\"E-mail\"]"));

        // find the email link by XPath -> //tagName[contains(@attribute, ’attributeValue’)]
       // WebElement emailLink = driver.findElement(By.xpath("//label[contains(@for,\"email\")]"));

       // WebElement emailLink = driver.findElement(By.xpath("//*[@for=\"email\"]"));

// find element by absolute xpath:
        WebElement emailLink = driver.findElement(By.xpath("/html/body/div//label"));

        System.out.println("emailLink = " + emailLink);

        if (emailLink.isDisplayed()&homeLink.isDisplayed()){
            System.out.println("Links are displayed, Test PASSED");
        }else {
            System.out.println("Links are not displaying, Test FAILED");
        }

        driver.quit();











    }
}
