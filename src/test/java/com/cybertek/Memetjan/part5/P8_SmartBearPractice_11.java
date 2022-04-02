package com.cybertek.Memetjan.part5;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class P8_SmartBearPractice_11 extends TestBase {

    public static void removeName(WebDriver driver,String name ) throws Exception{

        // create properties object in order to read properties file
        Properties properties = new Properties();

        // open the properties file on JVM memory using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        System.out.println("git");
        // load the file
        properties.load(file);

        // getting the url from properties
        String Url = properties.getProperty("smartbearUrl");

        // open the url using chrome browser
        driver.get(Url);
        BrowserUtils.wait(3);

        // logging in the smartBear web page
        SmartBearUtilities.loginToSmartBear(driver);

        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
        for (WebElement each : nameList){
            String eachText = each.getText();
            if (eachText.contains(name)){
                each.click();
                WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]"));
                deleteButton.click();
            }else {
                System.out.println("There is no person with this name: "+name);
            }
        }


    }


}
