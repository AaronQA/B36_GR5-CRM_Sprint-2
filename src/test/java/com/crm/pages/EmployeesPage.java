package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EmployeesPage {

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesButton;

    public void inEmployeesPage(String expectedPage){
        if(expectedPage.equals("Employees")) {
            employeesButton.click();
            Assert.assertTrue(employeesButton.isDisplayed());
        }else{
            throw new Error("The page is not displayed");
        }
    }

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureHeader;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartmentButton;

//    Inside the "Add department" form.
    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;

    public void selectParentDepartment() {
        WebElement parentDropdown = Driver.getDriver().findElement(By.xpath("//select[@id='IBLOCK_SECTION_ID']"));
        Select select = new Select(parentDropdown);
        WebElement selectedOption = select.getFirstSelectedOption();
    }

    public void clickButton(String expectedButton){
        if(expectedButton.equals("Add department")) {
            addDepartmentButton.click();
        }else if(expectedButton.equals("Add")) {
            addButton.click();
        }
    }

    @FindBy(xpath = "//div[@class='structure-dept-title-text']")
    public List<WebElement> departmentTitles;

    public void verifyDepartmentTitle(String expectedTitle) {
        BrowserUtils.refreshPage();
        boolean found = false;
        for (WebElement titleElement : departmentTitles) {
            if (titleElement.getText().trim().equalsIgnoreCase(expectedTitle)) { // Using equalsIgnoreCase for case-insensitivity
                System.out.println("Department found: " + expectedTitle);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new AssertionError("Department not found: " + expectedTitle);
        }
    }

    public void addDepartmentNotVisible(String expectedButton){
        switch (expectedButton) {
            case "Add department":
                boolean isVisible = addDepartmentButton.isDisplayed();
                if (isVisible) {
                    throw new AssertionError("The 'Add department' button should not be visible, but it is.");
                } else {
                    System.out.println("The 'Add department' button is correctly not visible.");
                }
                break;
        }
    }
}
