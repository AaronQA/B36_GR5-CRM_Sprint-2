package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDefs {
    
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }
    
    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
    loginPage.username.sendKeys(ConfigurationReader.getProperty(userType+"_username"));
    loginPage.password.sendKeys(ConfigurationReader.getProperty(userType+"_password"));
    loginPage.loginButton.click();
    }
    @Then("user should be able to see {string} as page title")
    public void user_should_be_able_to_see_as_page_title(String expectedTitle) {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
    
 
}
