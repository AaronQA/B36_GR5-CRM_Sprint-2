package com.crm.step_definitions;

import com.crm.pages.MyProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyProfilePageStepDefinition {

    MyProfilePage myProfilePage = new MyProfilePage();

    @When("the user navigates to the My Profile page")
    public void the_user_navigates_to_the_my_profile_page() {

    }

    @Then("the My Profile page should be accessible")
    public void the_my_profile_page_should_be_accessible() {

    }

    @Given("the user is on the My Profile page")
    public void the_user_is_on_the_my_profile_page() {

    }

    @Then("the {string} section should be visible and accessible")
    public void the_section_should_be_visible_and_accessible(String string) {

    }
}