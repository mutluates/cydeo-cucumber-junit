package com.cydeo.step_definitions;

import com.cydeo.pages.DicePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class DiceStepDefinition {

    DicePage dicePage = new DicePage();

    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        dicePage.careersDropdown.click();
        BrowserUtils.sleep(2);
        dicePage.jobSearchButton.click();
        BrowserUtils.sleep(2);
        dicePage.keywordBox.sendKeys("java" + Keys.ENTER);
        dicePage.zipcodeBox.sendKeys("22102"+ Keys.ENTER);
    }
    @Then("User should see search results")
    public void user_should_see_search_results() {
        BrowserUtils.sleep(2);
        System.out.println("Job Count = " + dicePage.totalJobs.getText());
    }

}
