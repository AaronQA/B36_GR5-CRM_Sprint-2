package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends HomePage {

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployeesButton;

    @FindBy(xpath= "//span[.='Please specify at least one person.']")
    public WebElement errorMessagePerson;

    @FindBy(xpath= "//span[.='The message title is not specified']")
    public WebElement errorMessageTitle;

    @FindBy(xpath = " //span[contains(text(),'All employees')]")
    public WebElement allEmployeesMessage;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel'] ")
    public WebElement cancelButton;



}
