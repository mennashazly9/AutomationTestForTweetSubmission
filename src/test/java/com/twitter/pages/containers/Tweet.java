package com.twitter.pages.containers;

import com.twitter.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tweet extends BasePage {
    @FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div")
    private WebElement tweetField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[2]/div[4]/div/span/span")
    private WebElement tweetButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[2]/div[1]/div[3]/div")
    private WebElement characterCounter;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[1]/div/div/div/div/span")
    private WebElement errorMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div")
    private WebElement gifIcon;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/img")
    private WebElement agreeGIFCategory;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[1]/div/img")
    private WebElement firstAgreeGIF;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[1]/div")
    private WebElement imageIcon;

    public WebElement getTweetButton() {
        return tweetButton;
    }

    public WebElement getCharacterCounter() {
        return characterCounter;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getImageIcon() {
        return imageIcon;
    }

    public void clickOnTweetButton() {
        tweetButton.click();
    }

    public void clickOnGIFIcon() {
        gifIcon.click();
    }

    public void clickOnAgreeGIFCategory() {
        agreeGIFCategory.click();
    }

    public void clickOnFirstAgreeGIF() {
        firstAgreeGIF.click();
    }

    public void enterTweet(String tweet) {
        tweetField.sendKeys(tweet);
    }
}
