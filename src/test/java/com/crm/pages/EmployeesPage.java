package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage extends BasePage{

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='top_menu_id_company_3271504278']//span[.='Company Structure']")
    public WebElement companyStructureTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_342409671']//span[.='Find Employee']")
    public WebElement findEmployeeTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_2000783151']//span[.='Telephone Directory']")
    public WebElement telephoneDirectoryTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_1210526945']//span[.='Staff Changes']")
    public WebElement staffChangesTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_3998073650']//span[.='Efficiency Report']")
    public WebElement efficiencyReportTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_1597013884']//span[.='Honored Employees']")
    public WebElement honoredEmployeesTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_1125184122']//span[.='Birthdays']")
    public WebElement birthdaysTab;

    @FindBy (xpath = "//div[@id='top_menu_id_company_27577212']//span[.='New page']")
    public WebElement newPageTab;


}

