package com.crm.step_definitions;

import com.crm.pages.MyProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_03_MyProfilePageStepDefinition {

    MyProfilePage myProfilePage = new MyProfilePage();



/*
//    @When("the user navigates to the My Profile page")
//    public void the_user_navigates_to_the_my_profile_page() {
//       myProfilePage.navigateToProfilePage();
//
//    }
//    @Then("the My Profile page should be accessible")
//    public void the_my_profile_page_should_be_accessible() {
//
//        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("hr_username")));
//    }

 */


        @When("the user is on the My Profile page")
    public void the_user_is_on_the_my_profile_page() {
            myProfilePage.navigateToProfilePage();

    }
    @And("the {string} section should be visible and accessible")
    public void the_section_should_be_visible_and_accessible(String section){
        Assert.assertTrue(myProfilePage.personalUserEmail.isDisplayed());
        Assert.assertTrue(myProfilePage.general.isDisplayed());
        Assert.assertTrue(myProfilePage.drive.isDisplayed());
        Assert.assertTrue(myProfilePage.task.isDisplayed());
        Assert.assertTrue(myProfilePage.calendar.isDisplayed());
        Assert.assertTrue(myProfilePage.conversations.isDisplayed());

    }

//    @Given("the user is logged in with a valid account")
//    public void the_user_is_logged_in_with_a_valid_account() {
//       myProfilePage.navigateToProfilePage();
//
//    }

    @Then("the email under the General tab should match the user’s account email {string}")
    public void the_email_under_the_general_tab_should_match_the_user_s_account_email(String expectedEmail) {

            String actualEmail = myProfilePage.personalUserEmail.getText();
       actualEmail = actualEmail.trim();
       expectedEmail = expectedEmail.trim();
       Assert.assertEquals(expectedEmail,actualEmail);

    }

    private String getUserEmail(String userType) {
        switch (userType.toLowerCase()) {
            case "hr":
                return "hr15@cydeo.com";
            case "helpdesk":
                return "helpdesk15@cydeo.com";
            case "marketing":
                return "marketing15@cydeo.com";
                default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }
    }








}
