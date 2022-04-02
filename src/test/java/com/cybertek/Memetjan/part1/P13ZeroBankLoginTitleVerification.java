package com.cybertek.Memetjan.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13ZeroBankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.navigate().back();
        Thread.sleep(2000);


driver.findElement(By.id("account_activity_link")).click();
        Thread.sleep(2000);

String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
String expectedTitle = "Zero - Account Activity";
if (actualTitle.equals(expectedTitle)){
    System.out.println("Title verification PASSED");
}else {
    System.out.println("Title verification FAILED");
}
        System.out.println("===================================");
driver.findElement(By.linkText("Transfer Funds")).click();
        Thread.sleep(2000);

String actualTitle2 = driver.getTitle();
String expectedTitle2 = "Zero - Transfer Funds" ;

if (actualTitle2.equals(expectedTitle2)){
    System.out.println("Title2 verification PASSED");
}else {
    System.out.println("Title2 verification FAILED");
}

        System.out.println("=========================");

driver.findElement(By.linkText("Pay Bills")).click();
        Thread.sleep(2000);

String actualTitle3 = driver.getTitle();
        System.out.println("actualTitle3 = " + actualTitle3);
String expectedTitle3 = "Zero - Pay Bills";
if (actualTitle3.equals(expectedTitle3)){
    System.out.println("Title3 verification PASSED");
}else {
    System.out.println("Title3 verification FAILED");
}

        System.out.println("====================================");

driver.findElement(By.linkText("My Money Map")).click();
        Thread.sleep(2000);

String actualTitle4 = driver.getTitle();
String expectedTitle4 = "Zero - My Money Map";
        System.out.println("actualTitle4 = " + actualTitle4);

        if (actualTitle4.equals(expectedTitle4)){
            System.out.println("PASSED 4");
        }else {
            System.out.println("FAILED 4");
        }
        System.out.println("=============================");

        driver.findElement(By.linkText("Online Statements")).click();
        Thread.sleep(2000);
        String expectedTitle5 = "Zero - Online Statements";
        String actualTitle5 = driver.getTitle();
        System.out.println("actualTitle5 = " + actualTitle5);

        if (actualTitle5.equals(expectedTitle5)){
            System.out.println("Passed 5");
        }else {
            System.out.println("Failed 5");
        }

//driver.quit();
    }
}
