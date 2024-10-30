package com.crm.step_definitions;

import com.crm.pages.ActivityStreamPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_10_CreatePollSteps {
    WebDriver driver = new ChromeDriver();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage(driver);

    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_Activity_Stream_page() {
        driver.get("https://login2.nextbasecrm.com/stream/?login=yes");
    }

    @When("the user clicks on the Poll tab")
    public void the_user_clicks_on_the_Poll_tab() {
        activityStreamPage.clickPoll();
    }

    @Then("the default delivery option should be {string}")
    public void the_default_delivery_option_should_be(String expectedOption) {
        Assert.assertEquals(expectedOption, activityStreamPage.getDefaultDeliveryOption());
    }

    @When("the user fills in the question and answers but leaves the title blank")
    public void the_user_fills_in_the_question_and_answers_but_leaves_the_title_blank() {
        activityStreamPage.enterPollQuestion("What is your favorite language?");
        activityStreamPage.addPollOptions("Java", "Python");
    }

    @When("the user submits the poll")
    public void the_user_submits_the_poll() {
        activityStreamPage.submitPoll();
    }

    @Then("an error message {string} should be displayed")
    public void an_error_message_should_be_displayed(String expectedMessage) {
        Assert.assertTrue(activityStreamPage.isErrorMessageDisplayed(expectedMessage));
    }

    @When("the user enters a poll question and multiple answers")
    public void the_user_enters_a_poll_question_and_multiple_answers() {
        activityStreamPage.enterMessageTitle("Poll Title");
        activityStreamPage.enterPollQuestion("Which framework do you prefer?");
        activityStreamPage.addPollOptions("Spring", "Hibernate", "Struts");
    }

    @Then("a confirmation message should be displayed")
    public void a_confirmation_message_should_be_displayed() {
        Assert.assertTrue(activityStreamPage.isConfirmationDisplayed());
    }
}