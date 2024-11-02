package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.MessagePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SendingMessageStepDef {

    MessagePage messagePage = new MessagePage();


    @When("I select the Message tab")
    public void i_select_the_message_area() {
        messagePage.sendMessageArea.click();


    }

    @And("I type {string} in the message box")
    public void i_type_in_the_message_box(String word) {
        Driver.getDriver().switchTo().frame(messagePage.iframeInputMessage);
        messagePage.messageInput.sendKeys(word);

    }

    @And("the person was not specified")
    public void thePersonWasNotSpecified() {
        Driver.getDriver().switchTo().parentFrame();
        messagePage.deleteAllEmployeesButton.click();
    }


    @And("I press the Send button")
    public void i_press_the_Send_button() {

        messagePage.sendButtonInMessage.click();

    }

    @Then("I should see the error message {string} appears in the Activity Stream")
    public void iShouldSeeTheErrorMessageAppearsInTheActivityStream (String errorMessagePerson) {

        Assert.assertEquals(messagePage.errorMessagePerson.getText(), errorMessagePerson);
    }



    @Then("I should see the error message no Title  {string} appears in the Activity Stream")
    public void iShouldSeeTheErrorMessageNoTitleAppearsInTheActivityStream(String errorMessageTitle) {
        Assert.assertEquals(messagePage.errorMessageTitle.getText(), errorMessageTitle);

    }
}



































