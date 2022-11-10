package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage {
    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriverPool(),this);
    }

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderBtn;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement selectProduct;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement enterQuality;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement enterCustomerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement enterStress;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement enterCity;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement enterState;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement enterZipcode;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement enterCreditCard;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement enterExpCard;

    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> cardType;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement enterProcessOrder;

    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement actualName;

//input[@name='card']

}
