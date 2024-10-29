package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

//    Inside the "Add department" form.
    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = " //input[@id='NAME']")
    public WebElement departmentName;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartment;

    public void selectParentDepartment(String parentDepartments) {
        Select select = new Select(parentDepartment);
        select.selectByVisibleText(parentDepartments); // Assumes parentDepartment name matches dropdown text
    }


    @FindBy(xpath = "//table[@id='bx_str_level2_table']")
    public WebElement departmentBox;


    public void inEmployeesPage(){
        employeesButton.click();
    }



}
