package com.crm.step_definitions;


import com.crm.pages.HomePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This class contains step definitions for the user story US05 - Upload Files and Pictures.
 * It interacts with the HomePage to perform actions related to file and image uploads.
 *
 * @author Nadira
 * @version 1.0
 */
public class US05_UploadFilesAndPic_StepDefs {

    WebDriverWait wait;
    HomePage homePage = new HomePage();

    String projectPath = System.getProperty("user.dir");

    String filePathDocx = "src/test/resources/files/TestDocx.docx";
    String filePathJpeg = "src/test/resources/files/TestJpeg.jpg";
    String filePathPdf = "src/test/resources/files/TestPdf.pdf";
    String filePathPng = "src/test/resources/files/TestPng.png";
    String filePathTxt = "src/test/resources/files/TestTxt.txt";

    String docx = projectPath + "/" + filePathDocx;
    String jpeg = projectPath + "/" + filePathJpeg;
    String pdf = projectPath + "/" + filePathPdf;
    String png = projectPath + "/" + filePathPng;
    String txt = projectPath + "/" + filePathTxt;

    @Given("the user is on the message input screen")
    public void theUserIsOnTheMessageInputScreen() {

        homePage.sendMessageArea.click();

    }

    @And("the user clicks on the upload icon")
    public void theUserClicksOnTheUploadIcon() {
        homePage.uploadIcon.click();
    }

    @Given("the user selects the Upload files and images option and the user chooses a valid {string} file")
    public void theUserSelectsTheUploadFilesAndImagesOptionAndTheUserChoosesAValidFile(String fileType) {

        String filePath;

        switch (fileType.toLowerCase()) {
            case "pdf":
                filePath = pdf;
                break;
            case "txt":
                filePath = txt;
                break;
            case "jpeg":
                filePath = jpeg;
                break;
            case "png":
                filePath = png;
                break;
            case "docx":
                filePath = docx;
                break;
            default:
                throw new IllegalArgumentException("Unsupported file type: " + fileType);


        }
        homePage.uploadFile(filePath);

        Assert.assertTrue(homePage.uploadedFiles.isDisplayed());
        System.out.println("homePage.uploadedFiles.getText() = " + homePage.uploadedFiles.getText());


    }

    @Given("the user has uploaded a valid file")
    public void theUserHasUploadedAValidFile() {

        homePage.uploadFile(jpeg);

    }

    @When("the user clicks the Insert in Text button")
    public void theUserClicksTheInsertInTextButton() {


        homePage.insertInTextBtn.click();

    }

    @Then("the uploaded file should be displayed in the message input field")
    public void theUploadedFileShouldBeDisplayedInTheMessageInputField() {

        Assert.assertTrue(homePage.uploadedFiles.isDisplayed());
    }

    @And("the user should be able to type a message alongside the uploaded file")
    public void theUserShouldBeAbleToTypeAMessageAlongsideTheUploadedFile() {

        Driver.getDriver().switchTo().frame(homePage.iframeInputMessage);
        homePage.messageInput.sendKeys(" Be happy!");

    }

    @When("the user clicks the Remove icon next to the uploaded file or image")
    public void theUserClicksTheIconNextToTheUploadedFileOrImage() {

        homePage.filesDelBtn.click();

    }

    @Then("the file or image should be removed from the message input field")
    public void theFileOrImageShouldBeRemovedFromTheMessageInputField() {

        Assert.assertTrue(homePage.iframeInputMessage.getText().isEmpty());

    }

}
