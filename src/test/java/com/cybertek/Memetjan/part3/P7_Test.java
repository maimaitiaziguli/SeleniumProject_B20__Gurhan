package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P7_Test {
    public static void main(String[] args) {
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();

        P7_SmartbearLoginMethod.LoginToSmartbear(driver);
    }
}
