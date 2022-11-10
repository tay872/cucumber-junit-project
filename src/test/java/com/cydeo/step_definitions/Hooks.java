package com.cydeo.step_definitions;

import com.cydeo.utitlities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {




    @After
    public void teardownScenario(Scenario scenario){  //pixels are coming byte by byte
        // We will implement taking screenshot in this method
       // System.out.println("It will be closing browser using cucumber @After each scenario");
        //This part is very important for taking some screenshots

        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriverPool()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }




        Driver.closeDriver();
    }











}
