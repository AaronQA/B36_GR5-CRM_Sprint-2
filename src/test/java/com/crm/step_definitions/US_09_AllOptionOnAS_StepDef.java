package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class US_09_AllOptionOnAS_StepDef {


    HomePage activityStreamPage = new HomePage();

    //WebDriver driver = Hooks.driver;

    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_activity_stream_page() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("stream"));
    }

    @When("the user checks for the {string} option")
    public void the_user_checks_for_the_option(String option) {
        for (WebElement element : activityStreamPage.feedOptions) {
            if (element.getText().equals(option)) {
                System.out.println("The option '" + option + "' is present.");
            }
        }


    }

    @Then("the {string} option should be visible")
    public void the_option_should_be_visible(String expectedOption) {
//        List<String> actualFeedOptions= BrowserUtils.getElementsText(activityStreamPage.feedOptions);
//        Assert.assertEquals(actualFeedOptions, expectedFeedOptions);


        List<WebElement> feedOptions = activityStreamPage.feedOptions; // The list of options on the page
        boolean isOptionVisible = false;

        // Loop through each option and check if it matches the expected option
        for (WebElement option : feedOptions) {
            if (option.getText().trim().equals(expectedOption)) {
                isOptionVisible = option.isDisplayed(); // Check if the option is actually visible
                break;
            }
        }

        // Assert that the option is visible
        Assert.assertTrue("The option '" + expectedOption + "' should be visible, but it is not.", isOptionVisible);
    }

    @Given("the {string} tab is available")
    public void the_tab_is_available(String string) {

    }

    @When("the user clicks on the {string} tab")
    public void the_user_clicks_on_the_tab(String string) {

    }

    @Then("the following options should be visible under the MORE tab:")
    public void the_following_options_should_be_visible_under_the_more_tab(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

}
