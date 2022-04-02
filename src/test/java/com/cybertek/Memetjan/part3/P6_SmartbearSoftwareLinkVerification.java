package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class P6_SmartbearSoftwareLinkVerification {

    /*
    1.open browser
    2.go to website:
    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3.Enter username : "Tester"
    4.Enter password: "test"
    5.Click to Login button
    6.Print out count of all the links on landing page
    7.Print out each link text on this page
     */

   WebDriver driver;

   @BeforeMethod
    public void setUpBrowser()throws InterruptedException{

      // 1.open browser
      // 2.go to website:
     //  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

       driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       driver.manage().window().maximize();
      Thread.sleep(2000);
   }

   @Test
    public void smartbearLink_test1()throws InterruptedException{
      WebElement usernameInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
      usernameInputBox.sendKeys("Tester");
      Thread.sleep(2000);

      WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
      passwordInputBox.sendKeys("test");
      Thread.sleep(2000);

      WebElement loginButton = driver.findElement(By.className("button"));
      loginButton.click();

      List<WebElement> numberOfLinks = driver.findElements(By.xpath("//html//a"));
      System.out.println("numberOfLinks = " + numberOfLinks.size());
      for (WebElement eachLink:numberOfLinks){
         System.out.println( eachLink.getText());
      }
   }

}
