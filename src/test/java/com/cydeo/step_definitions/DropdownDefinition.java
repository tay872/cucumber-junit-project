package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DropdownDefinition {

    DropdownPage dropdownPage = new DropdownPage();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriverPool().get("https://practice.cydeo.com/dropdown");

    }


    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {

        List<String> actualOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownPage.monthDropdown);
        // Assert will check the size of the list first. If it is matching it will check/verification content 1 by 1
        Assert.assertEquals(expectedMonths, actualOptionsAsString);


    }
}
