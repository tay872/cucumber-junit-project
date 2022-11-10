package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrderDefinition {

    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    BasePage basePage = new BasePage();

    ViewAllOrderPage viewAllOrderPage = new ViewAllOrderPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriverPool().get("https://web-table-2.cydeo.com/login");
        webTableLoginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        webTableLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
         webTableLoginPage.submitBtn.click();
         //webTableOrderPage.orderBtn.click();
        basePage.orderButtonNavItem.click();



    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String familyBea) {
        Select select = new Select(webTableOrderPage.selectProduct);
        select.selectByVisibleText(familyBea);
    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
        //webTableOrderPage.enterQuality.clear();
        webTableOrderPage.enterQuality.sendKeys(Keys.BACK_SPACE);
        webTableOrderPage.enterQuality.sendKeys(String.valueOf(quantity));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String fullName) {
        webTableOrderPage.enterCustomerName.sendKeys(fullName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.enterStress.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.enterCity.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
            webTableOrderPage.enterState.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
            webTableOrderPage.enterZipcode.sendKeys(zipcode);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String creditCardType) {

        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,creditCardType);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String creditCardNumber) {
            webTableOrderPage.enterCreditCard.sendKeys(creditCardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expCard) {
        webTableOrderPage.enterExpCard.sendKeys(expCard);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.enterProcessOrder.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        //Assert.assertEquals(string,webTableOrderPage.actualName.getText());
        String actualCustomerName = viewAllOrderPage.findTable.getText();
        Assert.assertEquals(string,actualCustomerName);

    }





}
