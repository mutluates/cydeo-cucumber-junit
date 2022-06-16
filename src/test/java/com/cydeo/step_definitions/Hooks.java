package com.cydeo.step_definitions;

/*
ın the class we will be able to pass pre-& post- conditions to
each scenario and each step
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario() {

        System.out.println("==Setting up browser using cucumber");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        // scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.getDriver();

        // System.out.println("==Closing browser using cucumber @After");
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("-------> applying setup using @BeforeStep ");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("--------> applying tearDown using @AfterStep");
    }

}
