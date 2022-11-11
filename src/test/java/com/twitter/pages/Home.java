package com.twitter.pages;

import com.twitter.pages.containers.Tweet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div/span/div/div/span/span")
    private WebElement tweetButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[7]/div")
    private WebElement profileTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]")
    private WebElement outSideTweetOverlay;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]")
    private WebElement discardButton;

    public Tweet clickOnTweetButton(){
        tweetButton.click();
        return new Tweet();
    }

    public Profile clickOnProfileTab(){
        profileTab.click();
        return new Profile();
    }

    public void clickOnOutSideTweetOverlay() {
        outSideTweetOverlay.click();
    }
    public void clickOnDiscardButton(){
        discardButton.click();
    }
}
