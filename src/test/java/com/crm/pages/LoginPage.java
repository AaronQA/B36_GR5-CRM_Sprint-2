package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;
    
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;
    
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;
    
    /**
 * This function is responsible for logging in to the application using the provided username and password.
 *
 * @param username The username to be used for login. It should be a non-null and non-empty string.
 * @param password The password to be used for login. It should be a non-null and non-empty string.
 *
 * @return This function does not return any value. It interacts with the web elements on the login page to perform the login action.
 */
public void login(String username, String password) {
    this.username.sendKeys(username);
    this.password.sendKeys(password);
    loginButton.click();
}
    

    
    
}
