package com.cybertek.Memetjan.part2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_CybertekForgetPasswordURLVerification {
    public static void main(String[] args) throws InterruptedException{

      /*
      Practice Cybertek/forgetPassword URL verification
      1. Open chrome browser
      2. Go to http://practice.cybertekschool.com/forgot_password
      3.Enter any email into the input box
      4.Click on retrieve password
      5. Verify URL contains:
      Expected: "email_sent"
      6. Verify textbox displayed the content as expected:
      expected: "Your e-mail's been sent!"
       */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement inputBox = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        inputBox.sendKeys("michaelpee729@gmail.com");

        driver.findElement(By.cssSelector("button[id=\"form_submit\"]")).click();

        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "email_sent";

        if (currentUrl.contains(expectedUrl)){
            System.out.println("URL verification complete. Test PASSED");
        }else {
            System.out.println("URL verification complete. Test FAILED");
        }

       String actualTextBox = driver.findElement(By.cssSelector("h4[name=\"confirmation_message\"]")).getText();
        String expextedTextBox = "Your e-mail's been sent!";

if (actualTextBox.equals(expextedTextBox)){
    System.out.println("TextBox verification complete, Test PASSED");
}else {
    System.out.println("TextBox verification complete, Test FAILED");

}


driver.quit();

    }
}
