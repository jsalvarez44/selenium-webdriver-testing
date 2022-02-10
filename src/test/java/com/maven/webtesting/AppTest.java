package com.maven.webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver webdriver;

    @Before
    public void configureDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/sebask8er/Desktop/selenium-webdriver-testing/driver/chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://www.google.com");
    }

    @Test
    public void searchTesting() throws InterruptedException {
        WebElement qSearch = webdriver.findElement(By.name("q")); 
        WebElement btnKSearch = webdriver.findElement(By.name("btnK"));

        qSearch.sendKeys("automatization"); // example searching
        Thread.sleep(1500);
        btnKSearch.click();
    }
}
