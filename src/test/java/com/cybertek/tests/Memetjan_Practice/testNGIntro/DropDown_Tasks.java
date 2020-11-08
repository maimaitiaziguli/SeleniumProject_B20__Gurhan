package com.cybertek.tests.Memetjan_Practice.testNGIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown_Tasks{

  WebDriver driver;




    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
@BeforeMethod
        public void setUpMethod() {
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/dropdown");

}



@Test
    public void test2_verify_state_dropdown() throws InterruptedException {
//TC #2: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)



//3. Select Illinois

    Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
    stateDropdown.selectByVisibleText("Illinois");
    Thread.sleep(3000);

//4. Select Virginia
    stateDropdown.selectByValue("VA");
    Thread.sleep(3000);


//5. Select California
  stateDropdown.selectByIndex(5);
    Thread.sleep(3000);


    //6. Verify final selected option is California.
String actualText = stateDropdown.getFirstSelectedOption().getText();
 String expectedText = "California";
Assert.assertEquals(actualText,expectedText,"ActualText VS expectedText are not equal");

//Use all Select options. (visible text, value, index)
    driver.close();
}



@Test
    public void test3_date_dropdown_verification() throws InterruptedException {

//TC #3: Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select “December 1st , 1921” and verify it is selected.
//   Select year using   :visible text
//   Select month using  : value attribute
//   Select day using    : index number




    // 3. Select “December 1st , 1921” and verify it is selected.
Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
yearDropdown.selectByVisibleText("1921");
String actualYearText = yearDropdown.getFirstSelectedOption().getText();
String expectedYearText = "1921";
Assert.assertEquals(actualYearText,expectedYearText,"actualYearText VS expectedYearText are not equal");
Thread.sleep(3000);


Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
monthDropdown.selectByValue("11");
String actualMonthText = monthDropdown.getFirstSelectedOption().getText();
String expectedMonthText = "December";
Assert.assertEquals(actualMonthText,expectedMonthText);
    Thread.sleep(3000);


Select dateDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
dateDropdown.selectByIndex(0);
String actualDateText = dateDropdown.getFirstSelectedOption().getText();
String expectedDateText = "1";
Assert.assertEquals(actualDateText,expectedDateText);

    Thread.sleep(3000);
    //   Select year using   :visible text
    //   Select month using  : value attribute
   //   Select day using    : index number

}


@Test
public void test4_multiple_value_select_dropdown(){

//TC #4: Selecting value from multiple select dropdown
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
// 3. Select all the options from multiple select dropdown.
// 4. Print out all selected values.
//5. Deselect all values.




// 3. Select all the options from multiple select dropdown.
Select multipleDropdown = new Select(driver.findElement(By.name("Languages")));
multipleDropdown.selectByIndex(0);
multipleDropdown.selectByIndex(1);
multipleDropdown.selectByIndex(2);
multipleDropdown.selectByIndex(3);
multipleDropdown.selectByIndex(4);
multipleDropdown.selectByIndex(5);

// 4. Print out all selected values.
 List<WebElement> allSelectedValue = multipleDropdown.getAllSelectedOptions();
    System.out.println("allSelectedValue = " + allSelectedValue.toString());

//5. Deselect all values.










}







    @Test
    public void test5()throws InterruptedException{

        // TC #5: Selecting value from non-select dropdown
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Click to non-select dropdown
//4. Select Facebook from dropdown
//5. Verify title is “Facebook - Log In or Sign Up”




        //3. Click to non-select dropdown
        WebElement nonSelectDromdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDromdown.click();
        Thread.sleep(3000);
        //4. Select Facebook from dropdown

        WebElement facebookDropdown = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookDropdown.click();

//5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        Assert.assertEquals(actualTitle,expectedTitle,"Expected title is not equal to actual title. Verification FAILED");

       // driver.close();
    }









}
