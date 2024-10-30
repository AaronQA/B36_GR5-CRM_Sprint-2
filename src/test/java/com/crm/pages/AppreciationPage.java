package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationPage extends HomePage {

    @FindBy(xpath="//span[.='Appreciation']")
    public WebElement appreciationButton;

    @FindBy(xpath="//iframe[@class='bx-editor-iframe']")
    public WebElement iframeInputAppreciation;

    @FindBy(xpath="//span[.='The message title is not specified']")
    public WebElement emptyErrorNotSpecified;


}
