package com.cybertek.tests.Day2_Selenium_WarmUps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_URL_Verification {

    /*
    TC	#2:	Cybertek	verifications
    1.Open	Chrome	browser
    2.Go	to	https://practice.cybertekschool.com
    3.Verify	URL	containsExpected:	cybertekschool
    4.Verify	title:	Expected:	Practice
     */

    // Cybertek Verifications

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // this line will maximize the newly opened browser page
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com");
        System.out.println("Current Url: " +driver.getCurrentUrl());

        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println(" It matched the result. Passes test #1");
        }else{
            System.out.println("does not match with expected result. Did not pass test #1");
        }
        System.out.println("Driver title: " + driver.getTitle());
        if(driver.getTitle().toLowerCase().contains("practice")) {
            System.out.println("mathches with an expected result. Passed all the tests.");
        }else{
            System.out.println("does not match with the expected result. Failed test #2.");
        }
    }
}
