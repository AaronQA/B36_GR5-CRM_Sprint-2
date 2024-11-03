package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
//import com.crm.utilities.Driver;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class US_09_AllOptionOnAS_StepDef {


    HomePage activityStreamPage = new HomePage();


    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_activity_stream_page() {
        Assert.assertTrue("Activity Stream page did not load as expected.",
                        activityStreamPage.activityStreamTab.isDisplayed());

        //Assert.assertTrue(Objects.requireNonNull(Driver.getDriver().getCurrentUrl()).contains("stream"));
    }

    @When("the user verifies that the  feed options are visible on the page")
    public void the_user_checks_for_the_option() {
        for (WebElement each : activityStreamPage.feedOptions) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Then("the user verifies  the following feed options are as expected:")
    public void theUserVerifiesTheFeedOptionsAreAsExpected(String expectedFeedOption) {
        for (WebElement each : activityStreamPage.feedOptions) {
            System.out.println("each.getText() = " + each.getText());
            Assert.assertEquals(each.getText(), expectedFeedOption);
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


//    @Then("verify the following options are visible under the MORE tab as expected")
//    public void verifyTheFollowingAreVisibleUnderTheMORETabAsExpected(List<String> expectedMoreOptions) {
//        List<String> actualMoreOptions_as_STRING = new ArrayList<>();
//        for (WebElement each : activityStreamPage.moreDropdown) {
//            Assert.assertTrue(each.isDisplayed());
//            actualMoreOptions_as_STRING.add(each.getText());
//        }
//        Assert.assertEquals(actualMoreOptions_as_STRING, expectedMoreOptions);
//    }


    @Then("verify the following {int} options are visible under the MORE tab as expected")
    public void verifyTheFollowingOptionsAreVisibleUnderTheMORETabAsExpected(int expectedOptionCount, List<String> expectedOptions) {

        List<String> actualOptions = activityStreamPage.moreDropdown
                .stream()
                .map(WebElement::getText)
                .toList();
        // Verify the count of options
        Assert.assertEquals("The number of options under the MORE tab is not as expected.", expectedOptionCount, actualOptions.size());

        // Verify that all expected options are present
        Assert.assertTrue("Some expected options are missing under the MORE tab.", actualOptions.containsAll(expectedOptions));
    }
}
