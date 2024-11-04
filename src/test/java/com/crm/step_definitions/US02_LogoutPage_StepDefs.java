package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.LogoutPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US02_LogoutPage_StepDefs {

    //LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();


    @When("user clicks on the profile dropdown")
    public void user_clicks_on_the_profile_dropdown() {
        BrowserUtils.sleep(2);
        logoutPage.userProfile.click();
    }

    @Then("user clicks the logout button")
    public void user_clicks_the_button() {
        BrowserUtils.sleep(2);
        logoutPage.logout();
    }


    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {

        BrowserUtils.refreshPage();
        BrowserUtils.verifyURLContains("login");
    }


    @Then("user should be able to see following options under profile name")
    public void user_should_be_able_to_see_options_under_profile_name(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();
        actualOptions.add(logoutPage.myProfile.getText());
        actualOptions.add(logoutPage.editProfileSettings.getText());
        actualOptions.add(logoutPage.themes.getText());
        actualOptions.add(logoutPage.configureNotifications.getText());
        actualOptions.add(logoutPage.logoutButton.getText());

        Assert.assertEquals(expectedOptions, actualOptions);
    }


}
