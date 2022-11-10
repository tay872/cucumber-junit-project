package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It's from Given");
    }
    @When("he eat some cucumbers")
    public void he_eat_some_cucumbers() {
        System.out.println("It's from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It's from Then");
    }
}
