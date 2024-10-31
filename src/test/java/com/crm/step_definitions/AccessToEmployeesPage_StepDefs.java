package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.EmployeesPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AccessToEmployeesPage_StepDefs {

    EmployeesPage employeesPage = new EmployeesPage();

    @When("user clicks on Employees page")
    public void user_clicks_on_employees_page() {
        employeesPage.employeeModule.click();
    }

    @Then("user should see the following modules")
    public void user_should_see_the_following_modules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<String>();
        actualModules.add(employeesPage.companyStructureTab.getText());
        actualModules.add(employeesPage.findEmployeeTab.getText());
        actualModules.add(employeesPage.telephoneDirectoryTab.getText());
        actualModules.add(employeesPage.staffChangesTab.getText());
        actualModules.add(employeesPage.efficiencyReportTab.getText());
        actualModules.add(employeesPage.honoredEmployeesTab.getText());
        actualModules.add(employeesPage.birthdaysTab.getText());
        actualModules.add(employeesPage.newPageTab.getText());

        Assert.assertEquals(expectedModules, actualModules);

    }

    @Then("{string} should be the default selected")
    public void should_be_the_default_selected(String string) {
        BrowserUtils.verifyTitleContains("Company Structure");
    }




}
