package com.cybertek.tests.Day2_Selenium_WarmUps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title_Verification {
    public static void main(String[] args) {

        // This is the task:
        /*
        TC#1:  google title Verification
        1. Open Chrome Browser
        2. Go to google.com page
        3. Verify title
         */


       // 1. Open Chrome Browser
        // set up our browser driver by calling WebDriverManager
        WebDriverManager.chromedriver().setup();

        // now set up instance of the driver
        // open a chrome browser
        WebDriver driver = new ChromeDriver();

        // this line below makes the browser maximized
        driver.manage().window().maximize();
            // using the driver test selenium


         // 2. Go to google.com page
        // get method accepts parameter as a string
        // it get the web page link that we gave using selenium webdriver
        driver.get("http://google.com");


        //  3. Verify title
        // now get the title of the page, returns it as a String
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");

        }else{
            System.out.println("Title verification Failed!");
        }

        driver.close();
    }
}
