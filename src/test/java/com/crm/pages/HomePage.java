package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//span[@id='feed-add-post-form-tab-message']")
    public WebElement message;

    @FindBy (xpath="//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement task;


    @FindBy (xpath="//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement event;


    @FindBy (xpath="//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;

    @FindBy (xpath="//span[@id='feed-add-post-form-link-more']")
    public WebElement  more;

    @FindBy (xpath="//span[@class='menu-popup-item-text']")
    public List<WebElement> moreDropdown;

    @FindBy(xpath= "//div[@id='user-block']")
    public WebElement userProfile;






}
