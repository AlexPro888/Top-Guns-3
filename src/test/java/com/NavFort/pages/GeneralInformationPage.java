package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {
    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetBtnDriver;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetBtnSManager;

    @FindBy(xpath = "//*[@href='entity/Extend_Entity_Carreservation']/span")
    public WebElement vehicleOption;

    @FindBy(xpath = "//table[contains(@class,'grid table-hover table table-bordered table-condensed')]")
    public WebElement vehiclesTable;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement generalInformationHeader;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement carsTable;

//    @FindBy(css = ".fa-eye.hide-text")
    @FindBy(xpath = "//i[@class='fa-eye hide-text']")
    public WebElement eyeIcon;

    @FindBy(xpath = "//a[@class='btn back icons-holder-text edit-button main-group']")
    public WebElement editBtn;

    @FindBy(xpath = "//a[@class=' btn icons-holder-text no-hash remove-button']")
    public WebElement deleteBtn;

    @FindBy(css = ".fa-clock-o.hide-text")
    public WebElement addEventBtn;

}
