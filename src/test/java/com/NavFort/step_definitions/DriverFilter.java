package com.NavFort.step_definitions;

import com.NavFort.pages.DriverFilterPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.sql.rowset.BaseRowSet;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DriverFilter {

    DriverFilterPage driverFilter = new DriverFilterPage();

    @When("The user hover over Fleet button")
    public void theUserHoverOverFleetButton() {
        BrowserUtils.waitForVisibility(driverFilter.fleetBtn, 15);
        BrowserUtils.hover(driverFilter.fleetBtn);
    }

    @And("The user clicks on Vehicles button")
    public void theUserClicksOnVehiclesButton() {
        BrowserUtils.waitForVisibility(driverFilter.vehicleBtn, 16);
        driverFilter.vehicleBtn.click();
    }

    @And("The user can access the Manage Filters button")
    public void theUserCanAccessTheManageFiltersButton() {
 BrowserUtils.waitFor(15);
        driverFilter.filterIcon.click();
        BrowserUtils.waitForVisibility(driverFilter.manageFilter, 15);
        driverFilter.manageFilter.click();

    }

    @When("The user can select Driver")
    public void the_user_can_select_driver() {

        BrowserUtils.waitFor(5);
        driverFilter.filterInput.sendKeys("Driver");

        BrowserUtils.waitFor(5);


        driverFilter.driveroption.click();
        BrowserUtils.waitFor(5);

    }

    @And("The user clicks Driver:All button to reveal a filter search box")
    public void theUserClicksDriverAllButtonToRevealAFilterSearchBox() {
        BrowserUtils.waitFor(5);
        driverFilter.driver_all.click();

    }

    @When("User clicks Contains dropdown")
    public void user_clicks_contains_dropdown() {
        BrowserUtils.waitFor(5);
        BrowserUtils.hover(driverFilter.choiceFilter);
        driverFilter.choiceFilter.click();

    }

    @Then("User should see all options under Menu")
    public void userShouldSeeAllOptionsUnderMenu(List<String> options) {

        Assert.assertTrue(driverFilter.verifyOptions(options));

    }


    @And("The user selects {string} method")
    public void theUserSelectsMethod(String method) {
        driverFilter.getOption(0,method).click();
    }

    @When("User enters {string}")
    public void user_enters(String keyword) {
        BrowserUtils.waitFor(5);
        driverFilter.searchBox.sendKeys(keyword);

    }

    @When("User clicks update button")
    public void user_clicks_update_button() {
        BrowserUtils.waitFor(5);
        driverFilter.updateButton.click();


    }


    @Then("Results should starts with specified {string}")
    public void results_should_starts_with_specified(String keyword) {
        BrowserUtils.waitFor(5);
        driverFilter.verifyStartsWith(keyword);
    }



    @Then("Results should end with specified {string}")
    public void results_should_end_with_specified(String keyword) {
        BrowserUtils.waitFor(5);
       driverFilter.verifyEndsWith(keyword);
    }


}