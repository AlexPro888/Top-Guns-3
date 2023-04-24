package com.NavFort.step_definitions;

import com.NavFort.pages.GeneralInformationPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class GeneralInformation {
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();
    int timeForExplicitWaits = 60;

    @Then("{string} hover over Fleet tab and click vehicles button")
    public void hover_over_tab(String user) {
        if (user.toLowerCase().contains("driver")) {
            BrowserUtils.waitFor(3);
            BrowserUtils.hover(generalInformationPage.fleetBtnDriver);
            generalInformationPage.fleetBtnDriver.click();
            BrowserUtils.waitForClickablility(generalInformationPage.vehicleOption, timeForExplicitWaits);
            generalInformationPage.vehicleOption.click();
        } else if (user.toLowerCase().contains("sales")) {
            BrowserUtils.waitFor(3);
            BrowserUtils.hover(generalInformationPage.fleetBtnSManager);
            BrowserUtils.waitForClickablility(generalInformationPage.vehicleOption, timeForExplicitWaits);
            generalInformationPage.vehicleOption.click();
        } else if (user.toLowerCase().contains("store")) {
            BrowserUtils.hover(generalInformationPage.fleetBtnSManager);
            BrowserUtils.waitForClickablility(generalInformationPage.vehicleOption, timeForExplicitWaits);
            generalInformationPage.vehicleOption.click();
            BrowserUtils.waitFor(3);
        }
    }

    @Then("{string} should see a table with all vehicle information displayed")
    public void user_should_see_a_table_with_all_vehicle_information_displayed() {
        BrowserUtils.waitForPageToLoad(5);
        assertTrue(generalInformationPage.vehiclesTable.isDisplayed());
    }

    @When("User click on any vehicle row")
    public void clickOnAnyVehicleRow() {
        BrowserUtils.waitFor(3);
        List<WebElement> allVehicles = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        System.out.println("allVehicles.size() = " + allVehicles.size());
        int randomIndex = new Random().nextInt(allVehicles.size() - 1) + 1;
        System.out.println("randomIndex = " + randomIndex);
        BrowserUtils.waitForClickablility(allVehicles.get(randomIndex), timeForExplicitWaits);
        BrowserUtils.waitForPageToLoad(timeForExplicitWaits);
        BrowserUtils.waitForVisibility(allVehicles.get(randomIndex), timeForExplicitWaits);
        allVehicles.get(randomIndex).click();
        BrowserUtils.waitFor(3);
    }

    @Then("User should see the General Information header")
    public void shouldSeeTheGeneralInformationHeader() {
        BrowserUtils.waitForPageToLoad(timeForExplicitWaits);
        Assert.assertTrue(generalInformationPage.generalInformationHeader.isDisplayed());
    }

    @Then("User should see the Cars table")
    public void should_see_the_cars_table() {
        Assert.assertTrue(generalInformationPage.carsTable.isDisplayed());
    }

    @And("{string} should see the ellipsis icon and hover over ellipsis then click the Eye icon")
    public void shouldSeeTheEllipsisIconAndHoverOverEllipsisThenClickTheEyeIcon(String user) {
        BrowserUtils.waitFor(3);
        String locatorEllipsis;
        List<WebElement> allVehicles = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        int randomIndex = new Random().nextInt(allVehicles.size()) + 1;
        System.out.println("randomIndex = " + randomIndex);
        BrowserUtils.waitForPageToLoad(timeForExplicitWaits);

        if (user.equalsIgnoreCase("driver")) {
            locatorEllipsis = "//tbody/tr[%s]/td[20]";

        } else {

            BrowserUtils.waitForVisibility(allVehicles.get(randomIndex), timeForExplicitWaits);
            locatorEllipsis = "//tbody/tr[%s]/td[21]";
        }
        locatorEllipsis = String.format(locatorEllipsis, randomIndex);
        System.out.println("locatorEllipsis = " + locatorEllipsis);

        WebElement ellipsis = Driver.getDriver().findElement(By.xpath(locatorEllipsis));
        BrowserUtils.waitForVisibility(ellipsis, timeForExplicitWaits);
        Assert.assertTrue(ellipsis.isDisplayed());
        BrowserUtils.hover(ellipsis);
        BrowserUtils.waitForClickablility(generalInformationPage.eyeIcon, timeForExplicitWaits);
        generalInformationPage.eyeIcon.click();
    }

    @And("User should see the Edit button")
    public void shouldSeeTheEditButton() {
        BrowserUtils.waitForVisibility(generalInformationPage.editBtn, timeForExplicitWaits);
        Assert.assertTrue(generalInformationPage.editBtn.isDisplayed());
    }

    @And("User should see the Delete button")
    public void shouldSeeTheDeleteButton() {
        BrowserUtils.waitForVisibility(generalInformationPage.deleteBtn, timeForExplicitWaits);
        Assert.assertTrue(generalInformationPage.deleteBtn.isDisplayed());
    }

    @And("User should see the Add Event button")
    public void shouldSeeTheAddEventButton() {
        BrowserUtils.waitForVisibility(generalInformationPage.addEventBtn, timeForExplicitWaits);
        Assert.assertTrue(generalInformationPage.addEventBtn.isDisplayed());
    }
}


