package com.cybertek.tests.Memetjan_Practice.Session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_LoginTitle_Verification {

    public static void main(String[] args) throws InterruptedException {




        // set up the driver
        WebDriverManager.chromedriver().setup();

        // open chrome browser
        WebDriver driver = new ChromeDriver();

        // open the link
        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();

driver.findElement(By.id("user_login")).sendKeys("username");
driver.findElement(By.id("user_password")).sendKeys("password");
Thread.sleep(3000);
driver.findElement(By.name("submit")).click();


//Thread.sleep(3000);

driver.findElement(By.id("account_activity_tab")).click();


// get the actual title and store it in a string
String actualTitle = driver.getTitle();
String expectedTitle = "Zero - Account Activity";

//  create if condition to verify the title

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is Passed");
        }else{
            System.out.println("Title verification is FAILED");
        }

        //Thread.sleep(3000);

        driver.findElement(By.id("transfer_funds_tab")).click();


        // get the actual title and store in a string
       String actualTitle1 =  driver.getTitle();
       String expectedTitle1 = "Zero - Transfer Funds";

       // create if condition for verification
        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Zero-Transfer Fund title verification is PASSED");
        }else{
            System.out.println("Zero-Transfer Fund title verification is FAILED");
        }

       // Thread.sleep(3000);

        driver.findElement(By.id("pay_bills_tab")).click();

        // get the actual title and store in a string
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Zero - Pay Bills";

        // create if condition for verification
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Zero - Pay Bills title verification is PASSED");
        }else{
            System.out.println("Zero - Pay Bills title verification is FAILED");
        }


       // driver.findElement(By.name("amount")).sendKeys("50"+ Keys.ENTER);

       // driver.findElement(By.id("sp_date")).click();
       // Thread.sleep(3000);

        //driver.findElement(By.className("ui-state-default")).click();

        //Thread.sleep(3000);

        //driver.findElement(By.id("sp_description")).sendKeys("Pay it before due date");
        //Thread.sleep(3000);

        //driver.findElement(By.className("btn btn-primary")).click();
        //Thread.sleep(3000);



        driver.findElement(By.id("money_map_tab")).click();

        String actualTitle3 = driver.getTitle();
        String expectedTitle3 = "Zero - My Money Map";

        // create if condition for verification
        if (actualTitle3.equals(expectedTitle3)){
            System.out.println("Zero - My Money Map title verification is PASSED");
        }else{
            System.out.println("Zero - My Money Map title verification is FAILED");
        }

       // Thread.sleep(3000);




        driver.findElement(By.id("online_statements_tab")).click();
        String actualTitle4 = driver.getTitle();
        String expectedTitle4 = "Zero - Online Statements";

        // create if condition for verification
        if (actualTitle4.equals(expectedTitle4)){
            System.out.println("Zero - Online Statements title verification is PASSED");
        }else{
            System.out.println("Zero - Online Statements title verification is FAILED");
        }

        Thread.sleep(3000);

/* practices for linkText() and partialLinkText()

String linkText = driver.findElement(By.linkText("Account Activity")).getText();
        System.out.println(linkText);

        String linkText2 = driver.findElement(By.partialLinkText("Account ")).getText();
        System.out.println(linkText2);

 */


driver.close();
    }
}
