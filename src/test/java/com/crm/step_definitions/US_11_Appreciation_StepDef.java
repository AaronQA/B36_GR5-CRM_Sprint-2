package com.crm.step_definitions;

import com.crm.pages.AppreciationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_11_Appreciation_StepDef {

    AppreciationPage appreciationPage= new AppreciationPage();

    // Scenario #1
    @Given("user clicks on the More dropdown button")
    public void user_clicks_on_the_more_dropdown_button() {
        appreciationPage.more.click();
    }
    @Given("user selects Appreciation option")
    public void user_selects_appreciation_option() {
        appreciationPage.appreciationButton.click();
    }
    @Given("user clicks on Send Button")
    public void user_clicks_on_send_button() {
        appreciationPage.sendButtonInMessage.click();
    }
    @Then("user sees the Error message {string}")
    public void user_sees_the_error_message(String expectedMessage) {
        String actualMessage=appreciationPage.errorMessageNoTitle.getText();
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }




    @And("user removes all recipients")
    public void userRemovesAllRecipients() {
        appreciationPage.deleteAllEmployee.click();
    }

    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String expectedMessage) {
        String actualMessage1=appreciationPage.errorMessageNoPerson.getText();
        Assert.assertEquals(actualMessage1,expectedMessage);

    }



}
