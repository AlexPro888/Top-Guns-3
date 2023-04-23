package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {
    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[2]//td[20]")
    public WebElement Ellipsis;

    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//li[1]")
    public WebElement EyeIcon;


}
