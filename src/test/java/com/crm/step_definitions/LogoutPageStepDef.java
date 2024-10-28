package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.LogoutPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutPageStepDef {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("user logged in with valid credentials")
    public void user_logged_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("hr", "UserUser");


    }
    @When("user clicks the avatar icon")
    public void user_clicks_the_avatar_icon() {
        logoutPage.profileIcon.click();


    }
    @When("user click the logout button")
    public void user_click_the_logout_button() {
        logoutPage.logoutButton.click();

    }
    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {

    }
}
