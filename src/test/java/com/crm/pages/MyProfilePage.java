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

    @FindBy(xpath="//a[@class='profile-menu-avatar user-default-avatar']")
    public WebElement defaultAvatar;

    @FindBy(xpath = "//a[@class='profile-menu-name']")
    public WebElement personalUser;


}
