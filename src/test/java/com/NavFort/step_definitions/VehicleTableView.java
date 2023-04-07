package com.NavFort.step_definitions;

import com.NavFort.pages.BasePage;
import com.NavFort.pages.VehicleTableViewPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.ConfigurationReader;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VehicleTableView {
    BasePage login = new BasePage();
    VehicleTableViewPage vehicleTableView= new VehicleTableViewPage();

    @When("user hover over {string} button")
    public void user_hover_over_button(String fleetBtn) {
        login.loginDriver();
        BrowserUtils.waitFor(5);
        BrowserUtils.hover(vehicleTableView.fleetBtn);
    }

    @And ("user clicks on {string} button")
    public void user_clicks_on_button(String vehicleBtn) {

        vehicleTableView.vehicleBtn.click();
    }

    @Then("user should see a table with all vehicle information displayed")
    public void verifyVehicleTableDisplayed() {
        BrowserUtils.waitFor(10);
        assertTrue(vehicleTableView.vehicleTable.isDisplayed());
    }

    @Then("user should see the total page number displayed")
    public void user_should_see_the_total_page_number_displayed() {
        BrowserUtils.waitFor(10);
        String actualPageTotalText = vehicleTableView.pageTotal.getText();
        String expectedPageTotalText = "Of 10 |";
        assertEquals(expectedPageTotalText, actualPageTotalText);
    }

    @When("user clicks the \">\" button")
    public void clickNextPageButton() {
        vehicleTableView.nextPageBtn.click();
    }
    @Then("user should see the next page of vehicle information displayed")
    public void verifyNextPageDisplayed() {
        BrowserUtils.waitFor(10);
        WebElement nextPageBtn = BrowserUtils.waitForVisibility(By.xpath("//i[@class='fa-chevron-right hide-text']"), 10);
        assertTrue(nextPageBtn.isDisplayed());
    }

    @When("user clicks the \"<\" button")
    public void clickPreviousPageButton() {

        vehicleTableView.previousButton.click();
    }

    @Then("user should see the previous page of vehicle information displayed")
    public void verifyPreviousPageDisplayed() {
        WebElement previousPage = BrowserUtils.waitForVisibility(By.xpath("//i[@class='fa-chevron-left hide-text']"),10);
        assertTrue(previousPage.isDisplayed());
    }

    @Then("user should see total recordings of vehicles top of the table")
    public void verifyTotalRecordingsDisplayed() {
        BrowserUtils.waitFor(10);
        WebElement totalRecordsLabel = Driver.getDriver().findElement(By.xpath("//label[@class='dib' and contains(text(),'Total of')]"));

    }



}
