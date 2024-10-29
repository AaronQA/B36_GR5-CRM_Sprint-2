package com.crm.step_definitions;

import com.crm.pages.EmployeesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_FunctionsOnCompanyStructure_StepDefs {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String expectedPage) {
        if(expectedPage.equals("Employees")) {
            employeesPage.employeesButton.click();
            //employeesPage.inEmployeesPage(); -> just double checking that the method works
            Assert.assertTrue(employeesPage.employeesButton.isDisplayed());
        }else{
            throw new Error("The page is not displayed");
        }
    }
    @Then("the {string} header should be visible on the page")
    public void the_header_should_be_visible_on_the_page(String expectedHeader) {
        String actualHeader = employeesPage.companyStructureHeader.getText();
        Assert.assertEquals(actualHeader, expectedHeader);
    }
// ---------------------------------------------------------------
    @When("user clicks the {string} button")
    public void user_clicks_the_button(String expectedButton) {
        if(expectedButton.equals("Add department")) {
            employeesPage.addDepartmentButton.click();
        }else if(expectedButton.equals("Add")) {
            employeesPage.addButton.click();
        }
    }
    @When("user enter the department name as {string}")
    public void user_enter_the_department_name_as(String departmentName) {
        employeesPage.departmentName.sendKeys(departmentName);
    }
    @When("user selects {string} as Parent department")
    public void user_selects_parent_department(String parentDepartment) {
        employeesPage.selectParentDepartment(parentDepartment);
    }



//    @Then("the new department {string} should be added successfully")
//    public void the_new_department_should_be_added_successfully(String string) {
//        Assert.assertTrue(employeesPage.departmentBox.getText().contains(string));
//    }



}
