package com.cybertek.Memetjan.part5;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class P7_SmartBearPractice_10 extends TestBase {

     /*
    TC #10: SmartBear edit order
    1. Open browser and login to SmartBear
    2. click the edit button from the right for "Steve Johns"
    3. change name to "Michael Jordan"
    4. click Update
    5. Assert "Michael Jordan" is in the list
     */

    @Test
    public void smartBearEditOrder_Test() throws Exception {
        // create a properties object in order to read  properties file
        Properties properties = new Properties();

        // opening the file in JVM memory using FileInputStream file
        FileInputStream file = new FileInputStream("configuration.properties");

        // loading the file into properties object
        properties.load(file);


        String url = properties.getProperty("smartbearUrl");
        BrowserUtils.wait(3);
        driver.get(url);


        SmartBearUtilities.loginToSmartBear(driver);

        // locating the edit button of "Steve Johns"
        WebElement steveJohnEditButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[3]/td[13]/input"));
        BrowserUtils.wait(3);
        steveJohnEditButton.click();
        BrowserUtils.wait(3);

        WebElement nameInputBox = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
        BrowserUtils.wait(2);
        nameInputBox.clear();
        nameInputBox.sendKeys("Michael Jordan");

        WebElement cardRadioButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]"));
        cardRadioButton.click();
        BrowserUtils.wait(2);


        WebElement upDateButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]"));
        upDateButton.click();
        BrowserUtils.wait(3);

        WebElement nameInputBox2 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[3]/td[2]"));

       Assert.assertTrue(nameInputBox2.getText().equals("Michael Jordan"),"Name change is FAILED, Test FAILED.");


       P8_SmartBearPractice_11.removeName(driver,"Steve h");


    }



}
