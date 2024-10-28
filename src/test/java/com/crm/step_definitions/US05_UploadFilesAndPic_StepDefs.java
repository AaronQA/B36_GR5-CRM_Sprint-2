package com.crm.step_definitions;


import com.crm.pages.HomePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


    @When("user selects the upload option")
    public void user_selects_the_upload_option() {
        homePage.sendMessageArea.click();

        homePage.uploadIcon.click();

    }

    @When("user chooses a valid file")
    public void user_chooses_a_valid_file() {

        homePage.uploadFile(docx);
        homePage.uploadFile(jpeg);
        homePage.uploadFile(pdf);
        //homePage.uploadFileAndImages.click(); dont need to click



    }

    @Then("system should upload the file successfully and user click insert in text button")
    public void system_should_upload_the_file_successfully_and_user_click_insert_in_text_button() {

        List<WebElement> uploadedFiles = Driver.getDriver().findElements(By.xpath("//span[@class='files-text']"));

        System.out.println("uploadedFiles.size() = " + uploadedFiles.size());
        Assert.assertEquals(uploadedFiles.size(), 3);


//        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
//        WebElement inserInTextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@id,'check-in-text-n')] ")));
//        for (WebElement eachFile : uploadedFiles) {
//            if( eachFile.isDisplayed()) {
//                inserInTextBtn.click();
//
//            }
//            if(inserInTextBtn.isEnabled()){
//                inserInTextBtn.click();
//            }
//
//        }

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

            // Loop through each uploaded file
            for (WebElement eachFile : uploadedFiles) {
                // Check if the file element is displayed
                if (eachFile.isDisplayed()) {
                    // Wait for the button to be visible
                    WebElement insertInTextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@id,'check-in-text-n')]")));

                    // Check if the button is enabled and click
                    if (insertInTextBtn.isEnabled()) {


                        insertInTextBtn.click();
                    }
                }
            }





//        List<String> uploadedFileNames = new ArrayList<>();
//
//        for (WebElement each : uploadedFiles) {
//
//            uploadedFileNames.add(each.getText());
//            System.out.println("uploadedFiles = " + uploadedFiles);
//        }
//
//        for (String eachName : uploadedFileNames) {
//
//            Assert.assertTrue(uploadedFileNames.contains(eachName));
//        }


    }

    @Then("uploaded file or image should display in message input field")
    public void uploaded_file_or_image_should_display_in_message_input_field() {

    }

    @Then("supported {string} are uploaded")
    public void supported_are_uploaded(String string) {

    }

}
