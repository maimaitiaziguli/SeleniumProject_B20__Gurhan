package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class P8_SmartBearOrderPlacing {
    // 1.open browser
    // 2.go to website:
    //  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    // 3.Enter username: "Tester
    // 4. Enter password: "test"
    //5. Click on login button
    //6. Click on Order
    //7. Select familyAlbum from product, set quantity to 2
    //8. Click to “Calculate” button
   //9. Fill address Info with JavaFaker
    //10. Click on “visa” radio button
    //11. Generate card number using JavaFaker
     //12. Click on “Process”
    //13.Verify success message “New order has been successfully added.” is displayed.


    @BeforeMethod
    public void setUpBrowserAndLogin(){
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();

        P7_SmartbearLoginMethod.LoginToSmartbear(driver);
    }

}
