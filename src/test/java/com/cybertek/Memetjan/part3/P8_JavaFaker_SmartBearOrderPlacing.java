package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P8_JavaFaker_SmartBearOrderPlacing {
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

    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
    }
    @Test
    public void smartBearTest2(){

        //call the method
        P7_SmartbearLoginMethod.LoginToSmartbear(driver);

        //6. Click on Order
        WebElement orderButton = driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]"));
        orderButton.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productDropdown = new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
        productDropdown.selectByVisibleText("FamilyAlbum");
        WebElement quantityInputBox = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
        quantityInputBox.sendKeys("2");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //8. Click to “Calculate” button
       WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]"));
        calculateButton.click();

        //9. Fill address Info with JavaFaker
        Faker faker = new Faker();
        String customerName = faker.name().fullName();
        String street = faker.address().streetName();
        String city = faker.address().city();
        String state = faker.address().state();
        String zipCode = faker.address().zipCode();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
        name.sendKeys(customerName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement streetAddress = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
        streetAddress.sendKeys("20012 Via Paviso");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement cityAddress = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));
        cityAddress.sendKeys(city);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement stateAddress = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]"));
        stateAddress.sendKeys(state);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement zip = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]"));
        zip.sendKeys("94086");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //10. Click on “visa” radio button

        //13.Verify success message “New order has been successfully added.” is displayed.
        WebElement visaRadioButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]"));
        visaRadioButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//11. Generate card number using JavaFaker
        String cardNumber = faker.finance().creditCard();

        WebElement cardNum = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
        cardNum.sendKeys("4400998733239875");


        WebElement expiration = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]"));
        expiration.sendKeys("07/22");


        //12. Click on “Process”
        WebElement processButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]"));
processButton.click();


String successMessage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong")).getText();
String expectedMessage = "New order has been successfully added.";

        Assert.assertEquals(successMessage,expectedMessage);

    }

}
