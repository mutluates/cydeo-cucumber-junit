package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String str) {

        String expectedTitle = str + " - Google'da Ara";
        String actualtitle = Driver.getDriver().getTitle();

        // Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals(expectedTitle,actualtitle);
    }

    @When("user type apple and clicks enter")
    public void user_type_apple_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google'da Ara";
        String actualtitle = Driver.getDriver().getTitle();

        // Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals(expectedTitle,actualtitle);
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }


    @Then("user should see {string} in the result")
    public void user_should_see_in_the_result(String expectedCapital) {

         String actualCapital = googleSearchPage.getCapital();
         Assert.assertEquals(expectedCapital,actualCapital);
    }






}
