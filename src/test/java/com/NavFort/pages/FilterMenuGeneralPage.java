package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterMenuGeneralPage {

    public FilterMenuGeneralPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driverFleetBtn;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement salesStoreFleetBtn;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesBtn;

    @FindBy(xpath ="//a[@title='Filters']/i")
    public WebElement filterIcon;

    @FindBy(xpath = "//button[@type='button']/a")
    public WebElement manageFiltersBtn;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> filters;











}
