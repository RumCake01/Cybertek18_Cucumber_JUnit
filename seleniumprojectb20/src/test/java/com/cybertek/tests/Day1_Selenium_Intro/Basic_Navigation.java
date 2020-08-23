package com.cybertek.tests.Day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {
        // to setup chromedriver
        WebDriverManager.chromedriver().setup();
        // to create an object of Chromedriver
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2 = "http://amazon.com";
        // will open browser with url
        driver.get(url);
        // will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //navigate to the amazon.com
        driver.navigate().to(url2);
        // wait for 3 sec
        Thread.sleep(3000);

        // will navigate back to the previous URl
        // in our case its a google.com
        driver.navigate().back();

        // wait for 3 sec
        Thread.sleep(3000);

        // will close web browser
        driver.close();

    }
}
