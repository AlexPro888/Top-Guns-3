package com.NavFort.step_definitions;

import com.NavFort.pages.GeneralInformationPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class GeneralInformation {
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();


    @Then("{string} hover over Fleet tab and click vehicles button")
    public void hover_over_tab(String user) throws InterruptedException {
        if (user.toLowerCase().contains("driver")) {
            BrowserUtils.waitFor(3);
            BrowserUtils.hover(generalInformationPage.fleetBtnDriver);
           generalInformationPage.fleetBtnDriver.click();
           Thread.sleep(1000);
            generalInformationPage.vehicleOption.click();
        } else if (user.toLowerCase().contains("sales")) {
            BrowserUtils.waitFor(3);
            BrowserUtils.hover(generalInformationPage.fleetBtnSManager);
            Thread.sleep(5000);
            generalInformationPage.vehicleOption.click();
        } else if (user.toLowerCase().contains("store")) {
            Thread.sleep(5000);
            BrowserUtils.hover(generalInformationPage.fleetBtnSManager);
            generalInformationPage.vehicleOption.click();
            Thread.sleep(5000);
        }
    }


    @Then("{string} should see a table with all vehicle information displayed")
    public void user_should_see_a_table_with_all_vehicle_information_displayed() {
        BrowserUtils.waitForPageToLoad(5);
        assertTrue(generalInformationPage.vehiclesTable.isDisplayed());
    }


    @When("{string} click on any vehicle row")
    public void clickOnAnyVehicleRow(String user) throws InterruptedException {

        Thread.sleep(2000);
        List<WebElement> allVehicles = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        System.out.println("allVehicles.size() = " + allVehicles.size());
        int randomIndex = new Random().nextInt(allVehicles.size()) + 1;
        System.out.println("randomIndex = " + randomIndex);
        Thread.sleep(3000);
        BrowserUtils.waitForClickablility(allVehicles.get(randomIndex),5);
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.waitForVisibility(allVehicles.get(randomIndex),5);
        allVehicles.get(randomIndex).click();
        Thread.sleep(3000);
    }

    @Then("{string} should see the General Information page")
    public void shouldSeeTheGeneralInformationPage(String user) {
        Assert.assertTrue(generalInformationPage.generalInformationHeader.isDisplayed());
    }
}


