package com.twitter.tests.submission.hooksHandler;

import com.twitter.browser.Browser;
import com.twitter.driver.WebDriverHandler;
import com.twitter.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksHandler extends BaseTest {
    @Before
    public void setUpTwitterWebsite() {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        webDriverHandler.resetCache();
        webDriverHandler.navigateTo("https://twitter.com/i/flow/login");
    }

    @After("@Delete-TWEET")
    public void deleteTweet() {
        browser.twitter.home.clickOnOutSideTweetOverlay();
        browser.twitter.home.clickOnDiscardButton();
        browser.twitter.profile = browser.twitter.home.clickOnProfileTab();
        browser.twitter.profile.clickOnTweetOption();
        browser.twitter.profile.clickOnTweetDeleteButton();
        browser.twitter.profile.clickOnConfirmDeleteButton();
    }

    @After(order = 1)
    public void tearDown() {
        webDriverHandler.resetCache();
        WebDriverHandler.close();
    }


}
