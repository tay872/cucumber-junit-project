package com.cydeo.pages;

import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdamClassPage {

    public AdamClassPage(){
        PageFactory.initElements(Driver.getDriverPool(),this);
    }


    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='submit-form']")
    public WebElement submitBtn;

    public void login(String user,String pass){
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env"));
        username.sendKeys(user);
        password.sendKeys(pass);
        submitBtn.click();
        // Driver.getDriverPool().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }
}
