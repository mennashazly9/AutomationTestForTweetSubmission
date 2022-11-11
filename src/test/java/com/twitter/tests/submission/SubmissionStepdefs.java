package com.twitter.tests.submission;

import com.twitter.tests.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SubmissionStepdefs extends BaseTest {

    @When("enter user name {string} in username field in login overlay")
    public void enterUsernameInUsernameFieldInLoginOverlay(String username) {
        browser.twitter.login.enterUsername(username);
    }


    @When("click on username field in login overlay")
    public void clickOnUsernameFieldInLoginOverlay() {
        browser.twitter.login.clickOnUsernameField();
    }

    @When("click on next button in login overlay")
    public void clickOnNextButtonInLoginOverlay() {
        browser.twitter.login.clickOnNextButton();
    }

    @When("enter password {string} in password field in enter your password overlay")
    public void enterPasswordInPasswordFieldInEnterYourPasswordOverlay(String password) {
        browser.twitter.login.enterPassword(password);
    }

    @When("click on login button in enter your password overlay")
    public void clickOnLoginButtonInEnterYourPasswordOverlay() {
        browser.twitter.home = browser.twitter.login.clickOnLoginButton();
    }

    @When("click on tweet button in home page")
    public void clickOnTweetButtonInHomePage() {
        browser.twitter.tweet = browser.twitter.home.clickOnTweetButton();
    }

    @When("enter a tweet {string} with 281 character in tweet overlay")
    public void enterATweetWithCharacterInTweetOverlay(String tweet) {
        browser.twitter.tweet.enterTweet(tweet);
    }

    @Then("tweet button in tweet overlay should be dimmed")
    public void tweetButtonInTweetOverlayShouldBeDimmed() {
        Assert.assertTrue(browser.twitter.tweet.getTweetButton().isEnabled());
    }

    @Then("counter of characters in tweet overlay should be {string}")
    public void counterOfCharactersInTweetOverlayShouldBe(String characterNumber) {
        Assert.assertEquals(browser.twitter.tweet.getCharacterCounter().getText(), characterNumber);
    }

    @When("enter a tweet {string} in tweet overlay")
    public void enterATweetInTweetOverlay(String tweet) {
        browser.twitter.tweet.enterTweet(tweet);
    }

    @When("click on tweet button in tweet overlay")
    public void clickOnTweetButtonInTweetOverlay() throws InterruptedException {
        Thread.sleep(1000);
        browser.twitter.tweet.clickOnTweetButton();
    }

    @Then("error message in tweet overlay should be {string}")
    public void errorMessageInTweetOverlayShouldBe(String errorMessage) {
        Assert.assertEquals(browser.twitter.tweet.getErrorMessage().getText(), errorMessage);
    }

    @Then("tweet button in tweet overlay should not be clickable")
    public void tweetButtonInTweetOverlayShouldNotBeClickable() {
        Assert.assertFalse(browser.twitter.tweet.getTweetButton().isEnabled());
    }

    @When("click on gif icon in tweet overlay")
    public void clickOnGifIconInTweetOverlay() {
        browser.twitter.tweet.clickOnGIFIcon();
    }

    @When("click on agree gifs in gif category")
    public void clickOnAgreeGifsInGifCategory() {
        browser.twitter.tweet.clickOnAgreeGIFCategory();
    }

    @When("click on first gif in dance gif category")
    public void clickOnFirstGifInDanceGifCategory() {
        browser.twitter.tweet.clickOnFirstAgreeGIF();
    }

    @Then("media icon in tweet overlay should be dimmed")
    public void mediaIconInTweetOverlayShouldBeDimmed() {
        Assert.assertTrue(browser.twitter.tweet.getImageIcon().isEnabled());
    }
}
