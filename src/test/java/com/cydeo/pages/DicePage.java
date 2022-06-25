package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DicePage {

    public DicePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='navbarDropdown-2']")
    public WebElement careersDropdown;

    @FindBy(xpath = "(//a[@class='dropdown-item '])[1]")
    public WebElement jobSearchButton;

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;

    @FindBy(id = "google-location-search")
    public WebElement zipcodeBox;

    @FindBy(id = "totalJobCount")
    public WebElement totalJobs;

}
