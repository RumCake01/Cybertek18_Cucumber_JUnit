package com.cybertek.tests.Day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomClass {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.instagram.com");

            login(driver, "put ur log in here", "put ur password here");
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[contains(.,'Not Now')]")).click();

            Thread.sleep(5000);
            WebElement user = driver.findElement(By.xpath("//input[@value='']"));
            user.sendKeys("pawapepsi");
            Thread.sleep(5000);
            user.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            user.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@id='react-root']/section/main/div/header/section/div/div/div/button")).click();
            Thread.sleep(5000);
            WebElement sendMessage = driver.findElement(By.xpath("//*[@id='react-root']/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea"));
            sendMessage.sendKeys("Hey there. I heard your having a girls night next friday? I am coming too :D LMK." + Keys.ENTER);
            Thread.sleep(1000);
            driver.close();
        }
        public static void login(WebDriver driver, String username, String password) throws InterruptedException {
            //logon commands
            Thread.sleep(5000);
            WebElement loginName = driver.findElement(By.xpath("//input[@name='username']"));
            loginName.sendKeys(username);

            Thread.sleep(1000);
            WebElement loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
            loginPassword.sendKeys(password + Keys.ENTER);
        }


}

