package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'title-level-1')][contains(text(),'Fleet')][1]")
    public WebElement FleetBtn;

    //    @FindBy(xpath = "(//a/span[contains(text(),'Vehicles')])[1]")
    // @FindBy(css = ".dropdown-menu-single-item.first")
//    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement VehicleOption;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement Table;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr[3]//td[4]")
    public WebElement Row3;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement GeneralInformationHeader;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[2]//td[20]")
    public WebElement Ellipsis;

    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//li[1]")
    public WebElement EyeIcon;


}