package com.maven.webtesting;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver driver;

    @Before
    public void configureDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/sebask8er/Desktop/selenium-webdriver-testing/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
