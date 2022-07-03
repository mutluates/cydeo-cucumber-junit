package com.cydeo.pages;

import com.cydeo.step_definitions.CloudTables;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {

    public CloudTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='New']")
    public WebElement newPerson;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement confirmDelete;

    @FindBy(xpath = "//td[.='No matching records found']")
    public WebElement errorMessage;

    public WebElement getNewPerson(String firstName, String lastName){
    return    Driver.getDriver().findElement(By.xpath("//td[.='"+firstName+" "+lastName+"']"));
    }

}
