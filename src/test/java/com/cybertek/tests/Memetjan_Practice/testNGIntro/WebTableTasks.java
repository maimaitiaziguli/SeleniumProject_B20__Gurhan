package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableTasks {

    //TC#3: Smartbear software order verification
    //1. Open browser and login to Smartbear software
    //2. Click on View all orders
    //3. Verify Susan McLaren has order on date “01/05/2010”

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Thread.sleep(1000);
        SmartBearUtilities.loginToSmartBear(driver);


    }

   @Test
   public void p3_verify_susans_order_date(){

      //1. Open browser and login to Smartbear software




       //    //2. Click on View all orders

       WebElement orderButton = driver.findElement(By.xpath("//a[.='View all orders']"));
       orderButton.click();


       //    //3. Verify Susan McLaren has order on date “01/05/2010”

       WebElement orderDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
       String actualOrderDate = orderDate.getText();
       String expectedOrderDate = "01/05/2010";

       Assert.assertEquals(actualOrderDate,expectedOrderDate,"Actual order date VS expected order date are not same. Verification FAILED ");










   }



}
