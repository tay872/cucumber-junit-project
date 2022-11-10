package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaSearchDefinition {

    WikipediaPage wikipediaPage = new WikipediaPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriverPool().get("https://www.wiktionary.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaPage.wikipediaSearchBox.sendKeys("Steve Jobs");
    }
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchKeyword) {
        wikipediaPage.wikipediaSearchBox.sendKeys(searchKeyword);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchBtn.click();
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String keywordTitle) {
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains(keywordTitle));
    }
}
