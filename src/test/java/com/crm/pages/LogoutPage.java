package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutPage extends HomePage {

    public LogoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    public void logout() {
        userProfile.click();
        logoutButton.click();
    }

    @FindBy(xpath = "//div[@id='menu-popup-user-menu']")
    public List<WebElement> profileIconOptions;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfileSettings;

    @FindBy(xpath = "//div[@id='menu-popup-user-menu']//span[text()='Themes']")
    public WebElement themes;

    @FindBy(xpath = "//span[text()='Configure notifications']")
    public WebElement configureNotifications;


}
