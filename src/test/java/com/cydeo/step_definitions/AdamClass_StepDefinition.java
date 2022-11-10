package com.cydeo.step_definitions;

import com.cydeo.pages.AdamClassPage;
import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdamClass_StepDefinition {

AdamClassPage adamClassPage = new AdamClassPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {

    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String string, String string2) {

    }
    @When("user click login button.")
    public void user_click_login_button() {

    }
    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {

    }


    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String arg0) {
        
    }
}
