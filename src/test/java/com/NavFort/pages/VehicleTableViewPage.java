package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    public WebElement getFleetBtn() {
        return fleetBtn;
    }
    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageButton;

@FindBy(xpath = "//h1[.='Cars']")
    public WebElement pageTitle;
@FindBy(xpath = "//*[@href='#' and @data-size='10']")
public WebElement viewPerPageOption10;
    @FindBy(xpath = "//*[@href='#' and @data-size='25']")
public WebElement viewPerPageOption25;

    @FindBy(xpath = "//*[@href='#' and @data-size='50']")
    public WebElement viewPerPageOption50;
    @FindBy(xpath = "//*[@href='#' and @data-size='100']")
    public WebElement viewPerPageOption100;
    @FindBy(xpath = "//tr/th[6]")
    public WebElement modelYear;

    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    public WebElement firstRecordedYear;

    @FindBy(xpath = "//tbody/tr[25]/td[6]")
    public WebElement lastRecordedYear;

@FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
public WebElement manageFiltersButton;

@FindBy(xpath = "//input[@type='checkbox']")
public List<WebElement> filtersCheckBoxes;

@FindBy(xpath = "//div[@style='display: inline-block;']")
public WebElement modelYearDropdown;

@FindBy (xpath = "//button[@fdprocessedid='wjqmde']")
   public WebElement filterUpdateButton;
@FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement resetFiltersButton;

@FindBy(xpath = "//a[@class='action btn mode-icon-only']")
public WebElement filtersButton;
@FindBy(xpath = "//input[@name='value']")
public WebElement insertValueFilterBox;
@FindBy(xpath = "//tr[1]/td[6]")
public WebElement firstValueOfModelYear;
}
