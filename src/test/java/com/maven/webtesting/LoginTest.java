package com.maven.webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver webdriver;

    @Before
    public void configureDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/sebask8er/Desktop/selenium-webdriver-testing/driver/chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://www.typingclub.com/login.html");
    }

    /**
     * Input test with wrong data entering
     * 
     * @throws InterruptedException
     */
    @Test
    public void inputTesting1() throws InterruptedException {
        Thread.sleep(4000); // to wait for the response time and load of the page
        
        WebElement username = webdriver.findElement(By.id("username"));
        WebElement password = webdriver.findElement(By.id("password"));
        WebElement loginBtn = webdriver.findElement(By.id("login-with-password"));

        username.sendKeys("sebask8er");
        password.sendKeys("1234");

        Thread.sleep(1500);
        loginBtn.click();
    }

    /**
     * Input test with valid data entering
     * 
     * @throws InterruptedException
     */
    @Test
    public void inputTesting2() throws InterruptedException {
        Thread.sleep(4000); // to wait for the response time and load of the page

        WebElement username = webdriver.findElement(By.id("username"));
        WebElement password = webdriver.findElement(By.id("password"));
        WebElement loginBtn = webdriver.findElement(By.id("login-with-password"));

        username.sendKeys("jsalvarez4");
        password.sendKeys("56793640");

        Thread.sleep(1500);
        loginBtn.click();
    }
}
