package com.cybertek.Memetjan.part5;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P3_ {


    @Test
    public void pp() throws IOException {


        Properties properties = new Properties();
        String path = "configuration.properties";
        FileInputStream file = new FileInputStream(path);
        properties.load(file);



        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("==================================");
        System.out.println(properties.getProperty("smartbearUrl"));

        System.out.println("==================================");

        System.out.println(ConfigurationReader.getProperty("browser"));




        // Close the file
       // file.close();
    }
}
