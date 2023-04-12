package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {
    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(@class,'title-level-1')][contains(text(),'Fleet')][1]")
    public WebElement FleetBtn;

    @FindBy(xpath = "//li[@class='dropdown-menu-single-item first']")
    public WebElement VehicleOption;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement Table;

    @FindBy(xpath ="//table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr[3]//td[4]")
    public WebElement Row3;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement GeneralInformationHeader;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[2]//td[20]")
    public WebElement Ellipsis;

    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//li[1]")
    public WebElement EyeIcon;


    

}
