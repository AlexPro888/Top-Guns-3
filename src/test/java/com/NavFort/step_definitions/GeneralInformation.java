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
        int randomIndex = new Random().nextInt(allVehicles.size() - 1)+1;
        System.out.println("randomIndex = " + randomIndex);
        Thread.sleep(3000);
        BrowserUtils.waitForClickablility(allVehicles.get(randomIndex), 5);
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.waitForVisibility(allVehicles.get(randomIndex), 5);
        allVehicles.get(randomIndex).click();
        Thread.sleep(3000);
    }

    @Then("{string} should see the General Information page")
    public void shouldSeeTheGeneralInformationPage(String user) {
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertTrue(generalInformationPage.generalInformationHeader.isDisplayed());
    }

    @Then("{string} should see the Cars table")
    public void should_see_the_cars_table(String string) {
        Assert.assertTrue(generalInformationPage.carsTable.isDisplayed());
    }

    @And("{string} should see the ellipsis icon and hover over ellipsis then click the Eye icon")
    public void shouldSeeTheEllipsisIconAndHoverOverEllipsisThenClickTheEyeIcon(String user) throws InterruptedException {
        Thread.sleep(2000);
        String locatorEllipsis;
        List<WebElement> allVehicles = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        int randomIndex = new Random().nextInt(allVehicles.size()) + 1;
        System.out.println("randomIndex = " + randomIndex);
        BrowserUtils.waitForPageToLoad(15);
        if (user.equalsIgnoreCase("driver")) {
            locatorEllipsis = "//tbody/tr[%s]/td[20]";

        } else {

            BrowserUtils.waitForVisibility(allVehicles.get(randomIndex), 5);
            locatorEllipsis = "//tbody/tr[%s]/td[21]";
        }
        locatorEllipsis = String.format(locatorEllipsis, randomIndex);
        WebElement ellipsis = Driver.getDriver().findElement(By.xpath(locatorEllipsis));
        BrowserUtils.waitForVisibility(ellipsis, 5);
        Assert.assertTrue(ellipsis.isDisplayed());
        BrowserUtils.hover(ellipsis);
        Thread.sleep(10000);
        generalInformationPage.eyeIcon.click();
    }

    @And("{string} should see the Edit button")
    public void shouldSeeTheEditButton(String user) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(generalInformationPage.editBtn.isDisplayed());
    }

    @And("{string} should see the Delete button")
    public void shouldSeeTheDeleteButton(String user) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(generalInformationPage.deleteBtn.isDisplayed());
    }

    @And("{string} should see the Add Event button")
    public void shouldSeeTheAddEventButton(String user) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(generalInformationPage.addEventBtn.isDisplayed());
    }
}


