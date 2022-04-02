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

public class P9_CybertekRegistration {

    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser(){
      driver= WebDriverFactory.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/registration_form");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void cybertekRegistrationForm_test1(){

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String userName = faker.name().username();
        String emailAddress = faker.internet().emailAddress();
        String password = faker.internet().password();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String dateOfBirth = faker.date().birthday().toString();

        WebElement EnterFirstName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        EnterFirstName.sendKeys(firstName);

        WebElement enterLastName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        enterLastName.sendKeys(lastName);

        WebElement enterUserName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input"));
        enterUserName.sendKeys("Alim123");

        WebElement enterEmailAddress = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
        enterEmailAddress.sendKeys(emailAddress);

        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
        enterPassword.sendKeys(password);

        WebElement enterPhoneNumber = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
        enterPhoneNumber.sendKeys("408-887-2121");

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[1]/label/input"));
        gender.click();

        WebElement enterDateOfBirth = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input"));
        enterDateOfBirth.sendKeys("07/12/1999");

       Select department = new Select(driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select")));
       department.selectByVisibleText("Department of Engineering");

       Select jobTitle = new Select(driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select")));
       jobTitle.selectByVisibleText("SDET");
       WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"inlineCheckbox2\"]"));
       checkBox.click();

       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       WebElement signUpButton = driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
       signUpButton.click();


       WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));
       String actualMessage = successMessage.getText();
       String expectedMessage = "You've successfully completed registration!";

        Assert.assertEquals(actualMessage,expectedMessage);


    }


}
