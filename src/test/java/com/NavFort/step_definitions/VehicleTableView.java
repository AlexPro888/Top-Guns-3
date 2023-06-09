package com.NavFort.step_definitions;

import com.NavFort.pages.BasePage;
import com.NavFort.pages.LoginPage;
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

public class VehicleTableView  {

    VehicleTableViewPage vehicleTableView= new VehicleTableViewPage();
    LoginPage loginPage=new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        loginPage.goLoginPage();
    }

    @When("User logs in as a {string}")
    public void loginAsDriver(String driver) {
        loginPage.loginAsUserType(driver);
    }

    @Then("User is on the {string} page")
    public void verifyPageDisplayed(String pageName) {
        String expectedPage = "Quick Launchpad";
        WebElement dashboardPage = BrowserUtils.waitForVisibility(By.xpath("//h1[@class='oro-subtitle']"),10);
        String actualPage = dashboardPage.getText();
        assertEquals(expectedPage, actualPage);
    }

    @When("user hover over {string} button")
    public void user_hover_over_button(String fleetBtn) {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.hover(vehicleTableView.fleetBtn);
    }

    @And ("user clicks on {string} button")
    public void user_clicks_on_button(String vehicleBtn) {

        vehicleTableView.vehicleBtn.click();
    }

    @Then("user should see a table with all vehicle information displayed")
    public void verifyVehicleTableDisplayed() {
        BrowserUtils.waitForPageToLoad(5);
        assertTrue(vehicleTableView.vehicleTable.isDisplayed());
    }

    @Then("user should see the total page number displayed")
    public void user_should_see_the_total_page_number_displayed() {
        BrowserUtils.waitForPageToLoad(5);
        String actualPageTotalText = vehicleTableView.pageTotal.getText();
        String expectedPageTotalText = "Of 10 |";
        assertEquals(expectedPageTotalText, actualPageTotalText);
    }

    @When("user clicks the \">\" button")
    public void clickNextPageButton() {
        BrowserUtils.waitForPageToLoad(10);
        vehicleTableView.nextPageBtn.click();
    }
    @Then("user should see the next page of vehicle information displayed")
    public void verifyNextPageDisplayed() {
        BrowserUtils.waitForPageToLoad(10);
        assertTrue(vehicleTableView.nextPageBtn.isDisplayed());
    }

    @When("user clicks the \"<\" button")
    public void clickPreviousPageButton() {
        BrowserUtils.waitForPageToLoad(10);
        vehicleTableView.previousButton.click();
    }

    @Then("user should see the previous page of vehicle information displayed")
    public void verifyPreviousPageDisplayed() {
        WebElement previousPage = BrowserUtils.waitForVisibility(By.xpath("//i[@class='fa-chevron-left hide-text']"),10);
        assertTrue(previousPage.isDisplayed());
    }

    @Then("user should see total recordings of vehicles top of the table")
    public void verifyTotalRecordingsDisplayed() {
        BrowserUtils.waitForPageToLoad(5);
        WebElement totalRecordsLabel = Driver.getDriver().findElement(By.xpath("//label[@class='dib' and contains(text(),'Total of')]"));

    }



}
