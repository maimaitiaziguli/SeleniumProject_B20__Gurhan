package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11ZeroBankLinkTextVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(2000);
        driver.manage().window().maximize();

String actualLinkText = driver.findElement(By.className("brand")).getText();
String expectedLinkText = "Zero Bank";
if (actualLinkText.equals(expectedLinkText)){
    System.out.println("Link text verification PASSED");
}else{
    System.out.println("Link text verification FAILED");

}

String expectedAttributeValue = "index.html";
String actualAttributeValue = driver.findElement(By.className("brand")).getAttribute("href");

if (actualAttributeValue.contains(expectedAttributeValue)){
    System.out.println("PASSED");
}else {
    System.out.println("FAILED");
}

driver.quit();

    }
}
