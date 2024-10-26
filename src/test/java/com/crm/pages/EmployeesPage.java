package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesButton;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureHeader;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartmentButton;

    public void inEmployeesPage(){
        employeesButton.click();
    }


}
