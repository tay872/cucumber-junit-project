package com.cydeo.pages;


import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriverPool(),this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> modules1;
    List<String > moduleText = new ArrayList<>();
    public  List<String> getModuleText(){
        for (int i = 0;i<modules1.size();i++){
            BrowserUtils.hover(modules1.get(i));
        }return moduleText;
    }

}
