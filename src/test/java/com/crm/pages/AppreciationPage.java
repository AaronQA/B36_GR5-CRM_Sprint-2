package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationPage extends HomePage {

    @FindBy(xpath="//span[.='Appreciation']")
    public WebElement appreciationButton;

    @FindBy(xpath="//iframe[@class='bx-editor-iframe']")
    public WebElement iframeInputAppreciation;

    @FindBy(xpath="//span[.='The message title is not specified']")
    public WebElement errorMessageNoTitle;

    @FindBy(xpath="//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployee;

    @FindBy(xpath="//span[.='Please specify at least one person.']")
    public WebElement errorMessageNoPerson;

    @FindBy (xpath=" //span[@class='feed-add-post-destination feed-add-post-destination-all-users']")
    public WebElement isAllEmployeesSelectedByDefault;



}
