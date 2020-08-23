package com.cybertek.tests.Day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    public static void main(String[] args) {

        // set up the webdriver
        WebDriverManager.chromedriver().setup();

        //2 create the instance of the chrome driver

        WebDriver driver  = new ChromeDriver();

        //3 - test if driver is working

        driver.get("https:www.facebook.com");
    }
}
