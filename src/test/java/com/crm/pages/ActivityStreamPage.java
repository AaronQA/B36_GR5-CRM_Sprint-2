package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {
    WebDriver driver;

    @FindBy(id = "poll")
    WebElement poll;

    @FindBy(id = "title")
    WebElement Title;

    @FindBy(id = "question")
    WebElement question;

    @FindBy(css = "answer1")
    WebElement answer1;

    @FindBy(id = "send")
    WebElement send;

    @FindBy(css = ".confirmationMessage")
    WebElement confirmationMessage;

    @FindBy(css = ".errorMessage")
    WebElement errorMessage;

    @FindBy(id = "deliveryOption")
    WebElement deliveryOption;

    public ActivityStreamPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickPoll() {
        poll.click();
    }

    public void enterMessageTitle(String title) {
        Title.sendKeys(title);
    }

    public void enterPollQuestion(String question) {
        this.question.sendKeys(question);
    }

    public void addPollOptions(String... options) {
        for (String option : options) {
            answer1.sendKeys(option);
        }
    }

    public void submitPoll() {
        send.click();
    }

    public boolean isConfirmationDisplayed() {
        return confirmationMessage.isDisplayed();
    }

    public boolean isErrorMessageDisplayed(String message) {
        return errorMessage.getText().equals(message);
    }

    public String getDefaultDeliveryOption() {
        return deliveryOption.getText();
    }
}