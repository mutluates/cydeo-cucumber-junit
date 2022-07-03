package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTables {

    CloudTablePage cloudTablePage = new CloudTablePage();
    String firstName;
    String lastName;

    @Given("User is on cloudTables homepage")
    public void user_is_on_cloud_tables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudTables.url"));
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        cloudTablePage.newPerson.click();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstname) {
        cloudTablePage.firstName.sendKeys(firstname);
        this.firstName = firstname;
    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastname) {
        cloudTablePage.lastName.sendKeys(lastname);
        this.lastName = lastname;
    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        cloudTablePage.positionBox.sendKeys(position);
    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        cloudTablePage.salaryBox.sendKeys(salary);
    }
    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablePage.createButton.click();
    }
    @When("User should be able to find person at the search box {string}")
    public void user_should_be_able_to_find_person_at_the_search_box(String situation) {
        cloudTablePage.searchBox.clear();
        cloudTablePage.searchBox.sendKeys(firstName+" "+lastName );
        if (situation.equals("positive")) {
            Assert.assertTrue(cloudTablePage.getNewPerson(firstName, lastName).isDisplayed());
        }else if (situation.equals("negative")){
            Assert.assertTrue(cloudTablePage.errorMessage.isDisplayed());
        }
    }
    @And("User deletes the person created")
    public void userDeletesThePersonCreated() {
        BrowserUtils.sleep(2);
        cloudTablePage.getNewPerson(firstName,lastName).click();
        cloudTablePage.deleteButton.click();
        cloudTablePage.confirmDelete.click();
        BrowserUtils.sleep(2);
    }


}
