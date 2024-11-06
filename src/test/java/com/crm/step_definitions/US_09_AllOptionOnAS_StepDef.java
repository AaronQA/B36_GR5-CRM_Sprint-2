package com.crm.step_definitions;

import com.crm.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US_09_AllOptionOnAS_StepDef {


    HomePage activityStreamPage = new HomePage();


    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_activity_stream_page() {
        Assert.assertTrue("Activity Stream page did not load as expected.",
                activityStreamPage.activityStreamTab.isDisplayed());

    }

    @When("the user verifies that the  feed options are visible on the page")
    public void the_user_checks_for_the_option() {
        for (WebElement each : activityStreamPage.feedOptions) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Then("the user verifies  the following feed options are as expected:")
    public void theUserVerifiesTheFeedOptionsAreAsExpected(DataTable expectedFeedOption) {
        List<String> expectedOptions = expectedFeedOption.asList();


        Assert.assertEquals("The number of feed options does not match",
                expectedOptions.size(),
                activityStreamPage.feedOptions.size());


        for (int i = 0; i < activityStreamPage.feedOptions.size(); i++) {
            String actualOptionText = activityStreamPage.feedOptions.get(i).getText();
            String expectedOptionText = expectedOptions.get(i);

            System.out.println("Actual option: " + actualOptionText + " | Expected option: " + expectedOptionText);

            Assert.assertEquals("Feed option text does not match",
                    expectedOptionText,
                    actualOptionText);
        }
    }


    @When("the MORE tab is displayed on the Activity Stream page")
    public void the_tab_is_available() {
        Assert.assertTrue(activityStreamPage.more.isDisplayed());
    }


    @And("the user clicks on the MORE tab")
    public void theUserClicksOnTheMORETab() {
        activityStreamPage.more.click();
    }


    @Then("verify the following {int} options are visible under the MORE tab as expected")
    public void verifyTheFollowingOptionsAreVisibleUnderTheMORETabAsExpected(int expectedOptionCount, List<String> expectedOptions) {

        List<String> actualOptions = activityStreamPage.moreDropdown
                .stream()
                .map(WebElement::getText)
                .toList();

        Assert.assertEquals("The number of options under the MORE tab is not as expected.", expectedOptionCount, actualOptions.size());


        Assert.assertTrue("Some expected options are missing under the MORE tab.", actualOptions.containsAll(expectedOptions));
    }
}
