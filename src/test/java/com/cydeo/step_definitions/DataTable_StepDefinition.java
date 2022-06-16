package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefinition {

    @Then("user should see fruit I like")
    public void user_should_see_fruit_i_like(List<String> fruits) {

        System.out.println(fruits);

    }


}
