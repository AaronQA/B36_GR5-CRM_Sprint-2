package com.crm.step_definitions;

import com.crm.pages.EmployeesPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US08_FunctionsOnCompanyStructure_StepDefs {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String expectedPage) {
        employeesPage.inEmployeesPage(expectedPage);
    }
    @Then("the {string} header should be visible on the page")
    public void the_header_should_be_visible_on_the_page(String expectedHeader) {
        String actualHeader = employeesPage.companyStructureHeader.getText();
        Assert.assertEquals(actualHeader, expectedHeader);
    }
// ---------------------------------------------------------------
    @When("user clicks the {string} button")
    public void user_clicks_the_button(String expectedButton) {
        employeesPage.clickButton(expectedButton);
    }
    @When("user enter the department name as {string}")
    public void user_enter_the_department_name_as(String departmentName) {
        employeesPage.departmentName.sendKeys(departmentName);
    }
    @When("user selects needed Parent department")
    public void user_selects_parent_department() {
        employeesPage.selectParentDepartment();
    }
    @Then("the new department {string} should be added successfully")
    public void the_new_department_should_be_added_successfully(String expectedName) {
        employeesPage.verifyDepartmentTitle(expectedName);
    }
//    ---------------------------------------------------------
    @Then("the {string} button should not be visible to the user")
    public void the_button_should_not_be_visible_to_the_user(String expectedButton) {
        employeesPage.addDepartmentNotVisible(expectedButton);
    }

}
