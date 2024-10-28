package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//span[.='My Profile']")
    public WebElement MyProfile;


    @FindBy(xpath = "//a[@class='profile-menu-name']")
    public WebElement personalUser;

    @FindBy(xpath = "//a[@class='profile-menu-email']")
    public WebElement email;

    @FindBy(xpath ="//a[.='General']")
    public WebElement general;

    @FindBy(xpath ="//a[.='Drive']")
    public WebElement drive;

    @FindBy(xpath ="//a[.='Tasks']")
    public WebElement task;

    @FindBy(xpath ="//a[.='Calendar']")
    public WebElement calendar;

    @FindBy(xpath ="//a[.='Conversations']")
    public WebElement conversation;
}
