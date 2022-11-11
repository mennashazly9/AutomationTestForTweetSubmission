package com.twitter.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverHandler {
    private static WebDriver webDriver;

    private static final String chromeDriverPath = "src/test/java/driverExtensions/chromedriver";


    public WebDriverHandler() {
        setUpWebDriver();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    private void setUpWebDriver() {
        String chromeDriverType = "webdriver.chrome.driver";
        System.setProperty(chromeDriverType, chromeDriverPath);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.quit();
    }
}