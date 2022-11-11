package com.twitter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile extends BasePage{
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div/section/div/div/div[4]/div/div/div/article/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div/div/div/div/div/div")
    private WebElement tweetOption;

    @FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[1]")
    private WebElement tweetDeleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]")
    private WebElement confirmDeleteButton;

    public void clickOnTweetOption(){
        tweetOption.click();
    }
    public void clickOnTweetDeleteButton() {
        tweetDeleteButton.click();
    }
    public void clickOnConfirmDeleteButton(){
        confirmDeleteButton.click();
    }
}
