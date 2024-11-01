package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutPage extends HomePage{

    public LogoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath= "//div[@id='user-block']")
//    public WebElement profileIcon;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    public void logout(){
        userProfile.click();
        logoutButton.click();
    }

    @FindBy(xpath = "//div[@class='menu-popup-items']")
    public List<WebElement> profileOptions;

    public void profileOptions(){
        userProfile.click();
        BrowserUtils.verifyElementDisplayed((By) profileOptions);
    }







}
