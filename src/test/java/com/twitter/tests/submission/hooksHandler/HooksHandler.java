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
        browser.twitterWebsite.home.clickOnOutSideTweetOverlay();
        browser.twitterWebsite.home.clickOnDiscardButton();
        browser.twitterWebsite.profile = browser.twitterWebsite.home.clickOnProfileTab();
        browser.twitterWebsite.profile.clickOnTweetOption();
        browser.twitterWebsite.profile.clickOnTweetDeleteButton();
        browser.twitterWebsite.profile.clickOnConfirmDeleteButton();
    }

    @After(order = 1)
    public void tearDown() {
        webDriverHandler.resetCache();
        WebDriverHandler.close();
    }


}
