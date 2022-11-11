package com.twitter.pages.containers;

import com.twitter.pages.BasePage;
import com.twitter.pages.Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {


    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")
    private WebElement usernameField;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div")
    private WebElement loginButton;


    public Home clickOnLoginButton() {
        loginButton.click();
        return new Home();
    }

    public void clickOnUsernameField() {
        usernameField.click();
    }

    public void clickOnNextButton(){
        nextButton.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);

    }

}