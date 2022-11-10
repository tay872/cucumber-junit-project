package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {

    public DropdownPage(){
        PageFactory.initElements(Driver.getDriverPool(),this);
    }
    @FindBy (xpath = "//select[@id='month']")
    public WebElement monthDropdown;





}
