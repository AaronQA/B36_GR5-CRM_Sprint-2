package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {
    WebDriver driver;

    @FindBy(id = "pollTab") // Replace with actual locator
    WebElement pollTab;

    @FindBy(id = "messageTitle") // Replace with actual locator
    WebElement messageTitle;

    @FindBy(id = "pollQuestion") // Replace with actual locator
    WebElement pollQuestion;

    @FindBy(css = ".pollOption") // Replace with actual locator
    WebElement pollOptions;

    @FindBy(id = "submitPoll") // Replace with actual locator
    WebElement submitButton;

    @FindBy(css = ".confirmationMessage") // Replace with actual locator
    WebElement confirmationMessage;

    @FindBy(css = ".errorMessage") // Replace with actual locator
    WebElement errorMessage;

    @FindBy(id = "deliveryOption") // Replace with actual locator for delivery option
    WebElement deliveryOption;

    public ActivityStreamPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickPollTab() {
        pollTab.click();
    }

    public void enterMessageTitle(String title) {
        messageTitle.sendKeys(title);
    }

    public void enterPollQuestion(String question) {
        pollQuestion.sendKeys(question);
    }

    public void addPollOptions(String... options) {
        for (String option : options) {
            pollOptions.sendKeys(option);
        }
    }

    public void submitPoll() {
        submitButton.click();
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