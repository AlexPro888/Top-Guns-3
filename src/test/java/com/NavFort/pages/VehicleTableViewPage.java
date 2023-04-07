package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTableViewPage {
    public VehicleTableViewPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(@class,'title-level-1')][contains(text(),'Fleet')][1]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[@class='grid-header-cell__label-container']")
    public WebElement vehicleTable;


    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement nextPageBtn;


    @FindBy(xpath = "//span[@class='title title-level-2' and text()='Vehicles'][1]")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement previousButton;

    @FindBy(xpath = "//label[@class='dib' and contains(text(),'of')][1]")
    public WebElement pageTotal;


}
