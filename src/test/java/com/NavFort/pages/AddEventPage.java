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

    @FindBy(xpath = "//i[@class='fa-clock-o hide-text']")
    public WebElement addEventbtn;
}
