package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Memetjan_SmartBearPractices_9_10_11 extends TestBase {



  /*
    TC #9: SmartBear delete order
    1. Open browser and login to SmartBear
    2. Delete “Mark Smith” from the list
    3. Assert it is deleted from the list
     */

   /* @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    */


    @Test
    public void p9_delete_order_task(){

        // 1. Open browser and login to SmartBear
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);


        // 2. Delete “Mark Smith” from the list
        WebElement selectButton = driver.findElement(By.xpath("//td[.='Mark Smith']//preceding-sibling::td[1]"));
        selectButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        deleteButton.click();
        // 3. Assert it is deleted from the list
        List<WebElement> nameList = driver.findElements(By.xpath("//td"));

        for (WebElement eachName : nameList) {

        }

        Assert.assertFalse(nameList.contains("Mark Smith"),"Failed");
    }


}
