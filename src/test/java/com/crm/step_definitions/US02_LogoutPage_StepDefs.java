package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.LogoutPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_LogoutPage_StepDefs {

    //LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @When("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {
        logoutPage.profileIcon.click();
    }

    @Then("user clicks the logout button")
    public void user_clicks_the_button() {
        logoutPage.logout();
    }


    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {

        BrowserUtils.refreshPage();
        BrowserUtils.verifyURLContains("login");

    }


}