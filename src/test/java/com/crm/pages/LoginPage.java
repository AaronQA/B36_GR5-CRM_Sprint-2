package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }






    public void login(String username, String password) {

    }


    public void login(String userType) {



    }



}
