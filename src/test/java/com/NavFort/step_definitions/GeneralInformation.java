package com.NavFort.step_definitions;

import com.NavFort.pages.GeneralInformationPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralInformation {
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();

    @When("The user hover over {string} tab")
    public void the_hover_over_fleet_button(String tabName) {
        WebElement tab= Driver.getDriver().findElement(By.xpath( "//a/span[contains(text(),'"+tabName+"')]"));
        BrowserUtils.waitForVisibility(tab, 5);
        BrowserUtils.hover(generalInformationPage.FleetBtn);

    }

    @When("The user clicks on Vehicles button")
    public void the_clicks_on_vehicles_button(String string) {
        generalInformationPage.VehicleOption.click();

    }

    @When("The user click on any vehicle row")
    public void the_click_on_any_vehicle_row(String string) {
        generalInformationPage.Row3.click();

    }

    @Then("The user should see the {string} page")
    public void the_can_see_the_page(String string, String string2) {
        Assert.assertTrue(generalInformationPage.GeneralInformationHeader.isDisplayed());


    }

}
