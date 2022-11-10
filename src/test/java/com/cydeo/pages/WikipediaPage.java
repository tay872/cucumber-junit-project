package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage() {
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement wikipediaSearchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;


}
