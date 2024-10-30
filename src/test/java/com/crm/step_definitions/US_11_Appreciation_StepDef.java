package com.crm.step_definitions;

import com.crm.pages.AppreciationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_11_Appreciation_StepDef {

    AppreciationPage appreciationPage= new AppreciationPage();

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
        String actualMessage=appreciationPage.emptyErrorNotSpecified.getText();
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }
}