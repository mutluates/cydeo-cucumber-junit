package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinition {

    @Then("user should see fruit I like")
    public void user_should_see_fruit_i_like(List<String> fruits) {
        System.out.println(fruits);
    }
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownPage dropdownPage = new DropdownPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        Select select = new Select(dropdownPage.monthDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //create a list of string and pass all of the actual web element options' string into that new list

        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }
        Assert.assertEquals(expectedMonths,actualOptions);
    }


}
