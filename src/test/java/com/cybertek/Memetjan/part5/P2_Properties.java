package com.cybertek.Memetjan.part5;

import org.testng.annotations.Test;

public class P2_Properties {

    @Test
    public void properties(){

        String sys = System.getProperty("os.name");
        System.out.println("sys = " + sys);

        String user = System.getProperty("user.password");
        System.out.println("user = " + user);

        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.password"));
    }
}
