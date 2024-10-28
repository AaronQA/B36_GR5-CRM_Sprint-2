package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    @FindBy(xpath= "//div[@id='user-block']")
    public WebElement profileIcon;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

//    public void logout(){
//        profileIcon.click();
//        logoutButton.click();
//    }
}
