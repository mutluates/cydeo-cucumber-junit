package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void sleep(int second){

        second *=1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * This meyhod will accept a String as expected value and verify actual URL contains the value.
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL) );
    }

    // This method will accept a dropdown as a WebElement and return all of the options' text in a List of String
    public static List<String> dropdownOption(WebElement dropdownElement){

        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //create a list of string and pass all of the actual web element options' string into that new list

        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }
        return actualOptions;
    }

}
