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

    @When("User hover over {string} tab")
    public void the_hover_over_fleet_button(String tabName) {
        WebElement tab= Driver.getDriver().findElement(By.xpath( "//a/span[contains(text(),'"+tabName+"')]"));
        BrowserUtils.waitForVisibility(tab, 5);
        BrowserUtils.hover(tab);
        BrowserUtils.waitFor(3);

    }

    @When("User clicks on the vehicles button")
    public void the_clicks_on_vehicles_button() {
//        BrowserUtils.waitForVisibility(generalInformationPage.VehicleOption,20);
        BrowserUtils.waitFor(6);
        generalInformationPage.VehicleOption.click();

    }

    @When("User click on any vehicle row")
    public void the_click_on_any_vehicle_row(){
        generalInformationPage.Row3.click();

    }

    @Then("User should see the General Information page")
    public void the_can_see_the_general_information_page() {
        Assert.assertTrue(generalInformationPage.GeneralInformationHeader.isDisplayed());


    }

}
