package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests {

  //TC #1: Smartbear software link verification
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click to Login button
    //6. Print out count of all the links on landing page
    //7. Print out each link text on this page

    WebDriver driver;

@BeforeMethod
public void smartBearMainPage(){

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    SmartBearUtilities.loginToSmartBear(driver);


}

    @Test
    public void test1_smartBear_LinkVerification(){
        //1. Open browser
        //2. Go to website:

        //3. Enter username: “Tester”
        //4. Enter password: “test”
        //5. Click to Login button
        /*driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

         */


        //6. Print out count of all the links on landing page
        //7. Print out each link text on this page
       List <WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println(allLinks.size());

       for (WebElement eachLink:allLinks){
           System.out.println(eachLink.getText());
       }









    }


@Test
    public void task2_create_order_with_javafaker() throws InterruptedException {
 //TC#2: Smartbear software order placing
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click on Login button
    //6. Click on Order
    //7. Select familyAlbum from product, set quantity to 2
    //8. Click to “Calculate” button
    //9. Fill address Info with JavaFaker
    //• Generate: name, street, city, state, zip code
    //10. Click on “visa” radio button
    //11. Generate card number using JavaFaker
    //12. Click on “Process”
    //13.Verify success message “New order has been successfully added.”








    //6. Click on Order
    WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
    orderLink.click();

    //7. Select familyAlbum from product, set quantity to 2
   Select productDropdown = new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct"))) ;
   productDropdown.selectByVisibleText("FamilyAlbum");
   Thread.sleep(1000);

    WebElement quantityInput =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
    Thread.sleep(1000);
    quantityInput.sendKeys(Keys.BACK_SPACE);

    Thread.sleep(1000);
    quantityInput.sendKeys("2");
    Thread.sleep(1000);

    //8. Click to “Calculate” button
WebElement calculateBoutton = driver.findElement(By.xpath("//input[@class='btn_dark']"));
calculateBoutton.click();

    Thread.sleep(1000);

// locate all of the web elements using id

    WebElement nameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));

    WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
    WebElement cityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
    WebElement stateInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
    WebElement zipInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));




    //9. Fill address Info with JavaFaker
    //• Generate: name, street, city, state, zip code
    Faker faker = new Faker();
    nameInput.sendKeys(faker.name().fullName());
    Thread.sleep(1000);

    streetInput.sendKeys(faker.address().streetAddress());
    Thread.sleep(1000);

    cityInput.sendKeys(faker.address().city());
    Thread.sleep(1000);

    stateInput.sendKeys(faker.address().state());
    Thread.sleep(1000);

    zipInput.sendKeys(faker.address().zipCode().replace("-",""));
    Thread.sleep(1000);




    //10. Click on “visa” radio button
    WebElement radioButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
radioButton.click();
    Thread.sleep(1000);

    //11. Generate card number using JavaFaker
    WebElement cardNumberInput = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
cardNumberInput.sendKeys(faker.business().creditCardNumber().replace("-",""));
    Thread.sleep(1000);
WebElement expirationDateInput = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
expirationDateInput.sendKeys(faker.numerify("12/24"));
    Thread.sleep(1000);
    //12. Click on “Process”

    WebElement processButton = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
    processButton.click();

    //13.Verify success message “New order has been successfully added.”
    WebElement disPlayMessage = driver.findElement(By.tagName("strong"));

    Assert.assertTrue(disPlayMessage.isDisplayed(),"Message is not displayed");
//String actualDisplayMessage = disPlayMessage.getText();
//String expectedDisplayString = "New order has been successfully added.";
   // Assert.assertEquals(actualDisplayMessage,expectedDisplayString);





}

}
