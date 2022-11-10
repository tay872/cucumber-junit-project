package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginDefinite {

    public WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env1"));
    }

    @When("user enter username{string} as a username")
    public void userEnterUsernameAsAUsername(String string ) {
        webTableLoginPage.username.sendKeys(string);
    }

    @And("user enter password{string} as a password")
    public void userEnterPasswordAsAPassword(String string) {
        webTableLoginPage.password.sendKeys(string);
    }
    @When("user click login button")
    public void user_click_login_button() {
        webTableLoginPage.submitBtn.click();
    }
    @Then("user should see url contain orders")
    public void user_should_see_url_contain_orders() {

        Assert.assertTrue(Driver.getDriverPool().getCurrentUrl().contains("orders"));

    }

    @When("user enter username{string} password {string} and click login button")
    public void userEnterUsernamePasswordAndClickLoginButton(String username, String password) {
       /*
        webTableLoginPage.username.sendKeys(username);
        webTableLoginPage.password.sendKeys(password);
        webTableLoginPage.submitBtn.click();
        */
        webTableLoginPage.login(username,password);
    }


    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
       /* webTableLoginPage.username.sendKeys(credentials.get("username"));
        webTableLoginPage.password.sendKeys(credentials.get("password"));
        webTableLoginPage.submitBtn.click();

        */
        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));

    }


    @When("user enter username{string}")
    public void userEnterUsername(String arg0) {
        webTableLoginPage.username.sendKeys(arg0);
    }
}
