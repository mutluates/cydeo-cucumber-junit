package com.cydeo.utilities;

import org.junit.Assert;

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

}
