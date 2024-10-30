package com.crm.step_definitions;


import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sending_Message {

    MessagePage messagePage= new MessagePage();

    @Given("I am logged in")
    public void i_am_logged_in() {








    }
    @When("I click on the message tab")
    public void i_click_on_the_message_tab() {
        // Write code here that turns the phrase above into concrete actions
        //WebElement messageTab = Driver.getDriver().findElement(By.id("//span[@id='feed-add-post-form-tab-message']"));
        // messageTab.click();





    }
    @When("I type {string} into the message input field")
    public void i_type_into_the_message_input_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebElement messageInput = Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/iframe[1]"));
        //   messageInput.sendKeys("hello world");



    }
    @When("click on the send button.")
    public void click_on_the_send_button() {
        // Write code here that turns the phrase above into concrete actions
        //   WebElement sendButton = Driver.getDriver().findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        //    sendButton.click();








    }
    @Then("I should see the message {string} displayed in the activity stream.")
    public void i_should_see_the_message_displayed_in_the_activity_stream(String string) {

        WebElement activityStream = Driver.getDriver().findElement(By.xpath("//div[@id='blog_post_body_615']"));



    }}