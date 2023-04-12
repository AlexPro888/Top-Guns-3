package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.FindAll;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import java.util.List;

public class DriverFilterPage {

    public DriverFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']/a")
    public WebElement manageFilter;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement filterInput;

    @FindBy(xpath = "//label[@for='ui-multiselect-0-0-option-2']")
    public WebElement driveroption;

    @FindBy(css = "div.filter-item > div.btn.filter-criteria-selector.oro-drop-opener.filter-default-value")
    public WebElement driver_all;

    @FindBy(css = "div.choice-filter button.dropdown-toggle")
    public WebElement choiceFilter;

    @FindBy(xpath = "//div[@class='value-field-frame']/input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='value-field-frame']/button")
    public WebElement updateButton;


    @FindBy(xpath = "//div[@class='filter-criteria dropdown-menu']/div/div/button/following-sibling::ul/li[4]")
    public WebElement startsWith;

    @FindBy(xpath = "//div[@class='filter-criteria dropdown-menu']/div/div/button/following-sibling::ul/li[5]")
    public WebElement endsWith;


    public void filterIconClick() {
        if (!Driver.getDriver().findElement(By.xpath("//a//i[@class='fa-filter hide-text']/..")).getAttribute("class").contains("pressed")) {
            filterIcon.click();
        }
    }

        public void selectDriverFilterOption(){
            driveroption.click();
        }

    public boolean verifyOptions(List<String> options) {
        boolean result = true;
        for (int i = 1; i <= options.size(); i++) {
            result = options.contains(getOption(i, null).getText());
        if (!result) {
            return false;
        }
    }
        return true;
    }

    public WebElement getOption(int index, String text) {
        if (text != null) {
            return Driver.getDriver().findElement(By.xpath("//div[@class='choice-filter']//li/a[.='" + text.toLowerCase() + "']"));
        }
        return Driver.getDriver().findElement(By.xpath("//div[@class='choice-filter']//li[" + index + "]/a"));
    }


    public List<String> getTdText() {
        int rowCount = Driver.getDriver().findElements(By.xpath("//tbody//tr")).size();
        List<String> trowsText = new ArrayList<>();
        for (int i = 1; i <= rowCount; i++) {
            trowsText.add(Driver.getDriver().findElement(By.xpath("//tbody//tr[" + i + "]//td[4]")).getText().toLowerCase());
        }
        return trowsText;
    }

    public boolean verifyStartsWith(String keyWord) {
        boolean result = true;
        for (String s : getTdText()) {
            result = s.startsWith(keyWord);
            if (!result) {
                return false;
            }
        }
        return true;
    }


    public boolean verifyEndsWith(String keyWord) {
        boolean result = true;
        for (String s : getTdText()) {
            result = s.endsWith(keyWord);
            if (!result) {
                return false;
            }
        }
        return true;
    }

    }


