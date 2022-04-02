package com.cybertek.Memetjan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10ZeroBankTitleVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(2000);
driver.manage().window().maximize();

String actualTitle = driver.getTitle();
String expectedTitle = "Zero-Log in";
if (expectedTitle.equals(actualTitle)){
    System.out.println("Title verification PASSED");
}else{
    System.out.println("Title verification FAILED");
}


driver.quit();

    }
}
