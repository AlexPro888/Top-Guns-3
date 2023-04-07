package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEventPage {
    public AddEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetBtn;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//*[.='49CAXR']")
    public WebElement car;


    @FindBy(xpath = "(//a[@href='javascript: void(0);'])[2]")
    public WebElement addEventBtnClick;

    @FindBy(xpath = "(//div[@tabindex='-1'])[1]")
    public WebElement AddEventPopUp;

    @FindBy(xpath = "//tbody[@class='grid-body']")
    public WebElement allCars;
}
