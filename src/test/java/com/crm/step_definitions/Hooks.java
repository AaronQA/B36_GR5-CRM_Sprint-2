package com.crm.step_definitions;


import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */
public class Hooks {
    LoginPage loginPage=new LoginPage();

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    /**
 * This method is a Cucumber Before hook for scenarios tagged with "@login" and provided "@userType" tag.
 * It performs a login operation based on the user type specified in the scenario tags.
 *
 * @param scenario The Cucumber Scenario object representing the current scenario.
 *                 It provides access to the scenario's tags and other information.
 */
@Before (value = "@login", order = 2 )
public void login_scenario_before(Scenario scenario) {

    String userType = "";
    if(scenario.getSourceTagNames().contains("@hr")){
        userType ="hr";
    }else if (scenario.getSourceTagNames().contains("@marketing")) {
        userType = "marketing";
    } else if (scenario.getSourceTagNames().contains("@helpdesk")) {
        userType = "helpdesk";
    }

    String username = ConfigurationReader.getProperty(userType+"_username");
    String password = ConfigurationReader.getProperty(userType+"_password");

    loginPage.login(username, password);
}

    /*
    @After will be executed automatically after EVERY scenario in the project.
     */
    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        BrowserUtils.sleep(2);
       // Driver.closeDriver();

    }

    //@BeforeStep
    public void setupStep(){
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }

    //@AfterStep
    public void teardownStep(){
        System.out.println("-----> @AfterSTEP : Running after each step!");
    }


}
