package com.cybertek.tests.day12_review_jsExcutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {


    @Test
    public void uploading_file_test(){
    //Getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();



        //get the path of the file you want to upload
        //MAC: right click on the file you want to upload
        //  Click and hold "OPTION" button and select "copy as path name"

        //Windows: Right click -> properties -> copy from location
        //OR SHIFT + RIGHT CLICK --> Copy as path
        String path = "/Users/arzigulm/Desktop/MyHTML/RED-APPLE.png";



        //Locate the upload web element
        WebElement uploadInput = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.wait(3);
        //send the path of the file to uploadInput webElement
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));

        //click to upload button
        BrowserUtils.wait(3);
        uploadButton.click();




    }

}
