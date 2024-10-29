package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDefs {
    
    LoginPage loginPage = new LoginPage();
    
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }
    
    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }
    @Then("user should be able to see {string} as page title")
    public void user_should_be_able_to_see_as_page_title(String expectedTitle) {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
    
    @When("user logs in with username as {string} and password as {string}")
    public void userLogsInWithUsernameAsAndPasswordAs(String username, String password) {
        loginPage.login(username, password);
    }
    
    @Then("user should see {string} error message")
    public void userShouldSeeErrorMessage(String expectedErrorMsg) {
        String actualErrorMsg = loginPage.errorText.getText();
        Assert.assertEquals("Error message not matching!",actualErrorMsg, expectedErrorMsg);
    }
    
    @And("user should see Remember me on this computer link visible")
    public void userShouldSeeLinkVisible() {
        BrowserUtils.verifyElementDisplayed(loginPage.rememberMeLink);
    }
    
    @And("user click the Remember me on this computer link")
    public void userClickTheLink() {
        BrowserUtils.selectCheckBox(loginPage.rememberMeCheckbox, true);
    }
    
    @Then("Remember me on this computer link should be selected")
    public void linkShouldBeSelected() {
        Assert.assertTrue("Checkbox is not selected as expected!",loginPage.rememberMeCheckbox.isSelected());
    }
    
    @When("user enters {string} to password field")
    public void userEntersToPasswordField(String randomPassword) {
        loginPage.password.sendKeys(randomPassword);
    }
    
    @Then("password field should display characters as bullet signs")
    public void passwordFieldShouldDisplayCharactersAsBulletSigns() {
        String fieldType = loginPage.password.getAttribute("type");
        String expectedFieldType="password";
        Assert.assertEquals("Password is not in bullet signs!",expectedFieldType,fieldType);
    }
}