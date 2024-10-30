package com.crm.step_definitions;


import com.crm.pages.HomePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US05_UploadFilesAndPic_StepDefs {
    HomePage homePage = new HomePage();

    String docx = "C:\\Users\\hrala\\IdeaProjects\\instructor\\B36_GR5-CRM_Sprint-2\\src\\test\\resources\\files\\TestDocx.docx";
    String jpeg = "C:\\Users\\hrala\\IdeaProjects\\instructor\\B36_GR5-CRM_Sprint-2\\src\\test\\resources\\files\\TestJpeg.jpg";
    String pdf = "C:\\Users\\hrala\\IdeaProjects\\instructor\\B36_GR5-CRM_Sprint-2\\src\\test\\resources\\files\\TestPdf.pdf";
    String png = "C:\\Users\\hrala\\IdeaProjects\\instructor\\B36_GR5-CRM_Sprint-2\\src\\test\\resources\\files\\TestPng.png";
    String txt = "C:\\Users\\hrala\\IdeaProjects\\instructor\\B36_GR5-CRM_Sprint-2\\src\\test\\resources\\files\\TestPdf.pdf";
    List<WebElement> uploadedFiles = Driver.getDriver().findElements(By.xpath("//span[@class='files-text']"));

    @When("user selects the upload option")
    public void user_selects_the_upload_option() {
        homePage.sendMessageArea.click();

        homePage.uploadIcon.click();

    }

    @When("user chooses a valid file")
    public void user_chooses_a_valid_file() {

        homePage.uploadFile(docx);
        homePage.uploadFile(jpeg);
//        homePage.uploadFile(pdf);
        //homePage.uploadFileAndImages.click(); dont need to click


    }

    @Then("system should upload the file successfully and user click insert in text button")
    public void system_should_upload_the_file_successfully_and_user_click_insert_in_text_button() {



        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        List<WebElement> insertInTextBtn = wait.until(ExpectedConditions.visibilityOfAllElements(Driver.getDriver().findElements(By.xpath("//span[contains(@id,'check-in-text-n')]"))));
        //List<WebElement> insertInTextBtn = wait.until(ExpectedConditions.visibilityOfAllElements(Driver.getDriver().findElements(By.xpath("//table[@class='files-list']//td[@class='files-info']//span[@class='insert-btn']"))));

        //List<WebElement> insertInTextBtn = Driver.getDriver().findElements(By.xpath("//div[@style='display: block; opacity: 1;']//span[contains(@id,'check-in-text-n')] "));
        //List<WebElement> insertInTextBtn = Driver.getDriver().findElements(By.xpath("//td[@class='files-info']"));

        for (WebElement each : insertInTextBtn) {


            each.click();





        }

        //Assert.assertEquals(1, uploadedFiles.size());

    }

    @And("uploaded file or image should display in message input field")
    public void uploadedFileOrImageShouldDisplayInMessageInputField() {

        //  homePage.messageInput.findElement("")



    }

    @Then("supported {string} are uploaded")
    public void supportedAreUploaded(String uploadType) {

    }
}