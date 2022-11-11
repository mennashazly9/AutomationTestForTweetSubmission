package com.twitter.pages;

import com.twitter.driver.WebDriverHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public abstract class BasePage {
    public BasePage() {
        int waitTime = 35;
        PageFactory.initElements(new AjaxElementLocatorFactory(WebDriverHandler.getWebDriver(), waitTime), this);
    }
}

