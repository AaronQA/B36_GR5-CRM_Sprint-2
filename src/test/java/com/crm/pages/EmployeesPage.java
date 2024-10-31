package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
public class EmployeesPage extends BasePage{






    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesButton;
    @FindBy (xpath = "//div[@id='top_menu_id_company_3271504278']//span[.='Company Structure']")
    public WebElement companyStructureTab;

    public void inEmployeesPage(String expectedPage){
        if(expectedPage.equals("Employees")) {
            employeesButton.click();
            Assert.assertTrue(employeesButton.isDisplayed());
        }else{
            throw new Error("The page is not displayed");
        }
    }
    @FindBy (xpath = "//div[@id='top_menu_id_company_342409671']//span[.='Find Employee']")
    public WebElement findEmployeeTab;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureHeader;
    @FindBy (xpath = "//div[@id='top_menu_id_company_2000783151']//span[.='Telephone Directory']")
    public WebElement telephoneDirectoryTab;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartmentButton;

    @FindBy (xpath = "//div[@id='top_menu_id_company_1210526945']//span[.='Staff Changes']")
    public WebElement staffChangesTab;

//    Inside the "Add department" form.
    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;
    @FindBy (xpath = "//div[@id='top_menu_id_company_3998073650']//span[.='Efficiency Report']")
    public WebElement efficiencyReportTab;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;
    @FindBy (xpath = "//div[@id='top_menu_id_company_1597013884']//span[.='Honored Employees']")
    public WebElement honoredEmployeesTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_1125184122']//span[.='Birthdays']")
    public WebElement birthdaysTab;

    public void selectParentDepartment() {
        WebElement parentDropdown = Driver.getDriver().findElement(By.xpath("//select[@id='IBLOCK_SECTION_ID']"));
        Select select = new Select(parentDropdown);
        WebElement selectedOption = select.getFirstSelectedOption();
    }

    @FindBy (xpath = "//div[@id='top_menu_id_company_27577212']//span[.='New page']")
    public WebElement newPageTab;

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
            if (titleElement.getText().trim().equalsIgnoreCase(expectedTitle)) {
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

