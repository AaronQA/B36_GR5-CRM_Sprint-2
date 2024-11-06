package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage extends LogoutPage {


    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userProfileIcon;

    @FindBy(xpath = "//span[text()='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath ="//div[@id='profile-menu-filter']")
    public  WebElement profileMenuFilter;


    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement personalUserEmail;


    @FindBy(xpath = "//a[.='General']")
    public WebElement general;

    @FindBy(xpath = "//a[contains(@class,'profile-menu-item') and contains(text(),'Drive')]")
    public WebElement drive;

    @FindBy(xpath = "//a[contains(@class,'profile-menu-item') and contains(text(),'Tasks')]")
    public WebElement task;

    @FindBy(xpath = "//a[contains(@class,'profile-menu-item') and contains(text(),'Calendar')]")
    public WebElement calendar;

    @FindBy(xpath = "//a[contains(@class,'profile-menu-item') and contains(text(),'Conversations')]")
    public WebElement conversations;

    public void navigateToProfilePage(){
        BrowserUtils.waitForPageToLoad(10);
        userProfileIcon.click();
        myProfile.click();
    }


    public void click() {
        myProfile.click();

    }
}