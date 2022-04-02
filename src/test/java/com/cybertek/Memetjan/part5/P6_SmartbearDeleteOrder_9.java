package com.cybertek.Memetjan.part5;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class P6_SmartbearDeleteOrder extends TestBase {

   /*
    TC #9: SmartBear delete order
    1. Open browser and login to SmartBear
    2. Delete “Mark Smith” from the list
    3. Assert it is deleted from the list
     */

    @Test
    public void delete_Order_Task() throws Exception {
        // create a properties object in order to read the property files
        Properties  properties = new Properties();

        // create a path of configuration properties
        String path = "configuration.properties";

        // opening the file in JVM memory using FileInputStream.
        FileInputStream file = new FileInputStream(path);

       // loading the file in to properties object
        properties.load(file);


       // Url from configuration properties
        String url = properties.getProperty("smartbearUrl");
        driver.get(url);
       // Ex:  String username = properties.getProperty("userName");


        SmartBearUtilities.loginToSmartBear(driver);


        //Locate the checkbox for 'Mark Smith' and click to it
        BrowserUtils.wait(3);
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl03_OrderSelector\"]"));
        BrowserUtils.wait(3);
        markSmithCheckBox.click();
        BrowserUtils.wait(3);


        //Locate 'Delete Selected' button and click to it
        WebElement deleteSelectedButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]"));
        BrowserUtils.wait(3);
        deleteSelectedButton.click();
        BrowserUtils.wait(3);


        //Assert 'Mark Smith' is not in the table
        List<WebElement> listOfWebElements = new ArrayList<>(driver.findElements(By.xpath("//table[@class = \"SampleTable\"]")));

        for (WebElement each :listOfWebElements){
           //String eachText = each.getText();
            //Assert.assertTrue(!eachText.contains("Mark Smith"),"Mark Smith is not deleted, test is FAILED");
            Assert.assertFalse(each.getText().contains("Mark Smith"));
        }





    }





}
