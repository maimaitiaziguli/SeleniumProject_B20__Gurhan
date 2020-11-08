package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

 ////Mini-Task:
       //#1- Create a new class called : SmartBearUtilities
       //#2- Create a static method called loginToSmartBear
       //#3- This method simply logs in to SmartBear when you call it.
       //#4- Accepts WebDriver type as parameter
       //BREAK UNTIL: 3.10PM CST - 4.10PM EST

    public static void loginToSmartBear(WebDriver driver){
        //3. Enter username: “Tester”

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }





 /*PRACTICE #4: Method: verifyOrder
        • Create a method named verifyOrder in SmartBearUtils class.
        • Method takes WebDriver object and String(name).
        • Method should verify if given name exists in orders.
        • This method should simply accepts a name(String), and assert whether
          given name is in the list or not.
        • Create a new TestNG test to test if the method is working as expected.
         */

    public static void verifyOrder(WebDriver driver, String name){



// created a locator that only returns the names of the customer from all of the rows
// Create a list and store the cells taht has customer name information into it
List <WebElement> namesList =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));


// If there is only one table on the page, you don't need to locate the the table--> //tr/td[2]
// List <WebElement> nameList =driver.findElements(By.xpath("//tr/td[2]"));

        for (WebElement each : namesList) {
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }
        }
       Assert.fail("Name "+name+" does not exit in the list! Verification FAILED");
    }





  /*
  Practice #5: Method: printNamesAndCities
• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
• Create a new TestNG test to test if the method is working as expected.
• Output should be like:
• Name1: name , City1: city
• Name2: name , City2: city
   */

  public static void printNamesAndCities(WebDriver driver){

      List <WebElement> namesList =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

     List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

      for (int i = 0; i<namesList.size();i++){
          System.out.println("Name "+(i+1)+": "+namesList.get(i).getText()+" , "+" City "+(i+1)+": "+ citiesList.get(i).getText());


      }



  }





}
