package com.crm.pages;

import com.crm.utilities.ConfigurationReader;
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

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorText;

    @FindBy(xpath = "//label[@for='USER_REMEMBER']")
    public WebElement rememberMeLink;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public WebElement rememberMeCheckbox;


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

    /**
     * This function is responsible for logging in to the application using a predefined user type.
     * The user type is used to retrieve the corresponding username and password from the configuration file.
     *
     * @param userType The type of user for which the login is being performed. It should be a non-null and non-empty string.
     *                 The user type is used to construct the property keys in the configuration file,
     *                 e.g., "admin_username" and "admin_password" for the "admin" user type.
     *
     * @return This function does not return any value. It interacts with the web elements on the login page to perform the login action.
     *         The username and password are retrieved from the configuration file using the provided user type.
     *         The retrieved username and password are then entered into the corresponding input fields on the login page.
     *         Finally, the login button is clicked to initiate the login process.
     */
    public void login(String userType){
        String username = ConfigurationReader.getProperty(userType+"_username");
        String password = ConfigurationReader.getProperty(userType+"_password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }
}