package com.cybertek.Memetjan.part3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P4_SelectingMultipleSelectDropdown {

    //  TC#1: selecting value from multiple select dropdown
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3.select all the options from the multiple select dropdown
//4. print all the selected values
//5. deselect all values

    WebDriver driver;
@BeforeMethod
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
    public void setUpBrowser(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
}
@Test
    public void selectMultipleDropdownValue_test()throws InterruptedException{
    // first create a select class' object then locate the the dropdown and pass it to the object
    Select multipleDropdown = new Select(driver.findElement(By.name("Languages")));
    System.out.println("multipleDropdown = " + multipleDropdown.isMultiple());

    List<WebElement> listOfMultipleSelectDropdown = multipleDropdown.getOptions();
    System.out.println("listOfMultipleSelectDropdown = " + listOfMultipleSelectDropdown.size());


    multipleDropdown.deselectAll();

    for (WebElement eachOption :listOfMultipleSelectDropdown){
        eachOption.click();
        Thread.sleep(2000);
        System.out.println(eachOption.getText());
    }

    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


}


/*@AfterMethod
    public void closingBrowser(){
    driver.quit();
}

 */





}
