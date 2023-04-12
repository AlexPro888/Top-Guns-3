package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class AddEventPage {
    public AddEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetBtn;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//tbody/tr")
    public WebElement car;


    @FindBy(css = "a[title='Add an event to this record']")
    public WebElement addEventBtnClick;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement closeEventBtn;

    @FindBy(xpath = "//div[@role='dialog']")
    public WebElement AddEventPopUp;


    @FindBy(xpath = "(//label[@class='required'])[1]")
    public WebElement titleField;

    @FindBy(xpath = "(//label[@class='required'])[2]")
    public WebElement ownerField;

    @FindBy(xpath = "(//label[@class='required'])[3]")
    public WebElement organizerDisplayNameField;

    @FindBy(xpath = "(//label[@class='required'])[4]")
    public WebElement organiserEmailField;

    @FindBy(xpath = "(//label[@class='required'])[5]")
    public WebElement startDateField;

    @FindBy(xpath = "(//label[@class='required'])[6]")
    public WebElement endtDateField;



}




