package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamTab;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement message;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement task;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement event;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement more;

    @FindBy(xpath = "//div[@class='feed-add-post-form-variants']/span")
    public List<WebElement> feedOptions;


    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> moreDropdown;

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userProfile;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadIcon;


    @FindBy(xpath = "//div[@style='display: block; opacity: 1;']//input[@type='file']")
    public WebElement uploadFileAndImages;



    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageInput;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageArea;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeInputMessage;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButtonInMessage;


    @FindBy(xpath = "//span[contains(@id,'check-in-text-')]")

    public WebElement insertInTextBtn;
    @FindBy(xpath = "//tr[contains(@id,'disk-edit-attachn')]/td[1]/span/span[1]")

    public WebElement uploadedFiles;


    @FindBy(xpath = "//span[@class='del-but']")

    public WebElement filesDelBtn;



    @FindBy(xpath = "//img")
    public WebElement picture;




    public void uploadFile(String fileType) {


        this.uploadFileAndImages.sendKeys(fileType);


    }


}