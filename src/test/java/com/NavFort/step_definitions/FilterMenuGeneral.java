package com.NavFort.step_definitions;

import com.NavFort.pages.FilterMenuGeneralPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.ConfigurationReader;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FilterMenuGeneral {
    LoginPage lgnP = new LoginPage();
    FilterMenuGeneralPage fMGeneral= new FilterMenuGeneralPage();

    @Given("The {string} is already on the Fleet Management page")
    public void the_is_already_on_the_fleet_management_page(String userType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if (userType.equalsIgnoreCase("Driver")){
            lgnP.usernameField.sendKeys(ConfigurationReader.getProperty("driver.username"));
            lgnP.passwordField.sendKeys(ConfigurationReader.getProperty("all.pw"));
            lgnP.loginBtn.click();
            BrowserUtils.waitForPresenceOfElement(By.className("oro-subtitle"),25);
        } else if (userType.equalsIgnoreCase("Sales Manager")) {
            lgnP.usernameField.sendKeys(ConfigurationReader.getProperty("salesmanager.username"));
            lgnP.passwordField.sendKeys(ConfigurationReader.getProperty("all.pw"));
            lgnP.loginBtn.click();
            BrowserUtils.waitForPresenceOfElement(By.className("oro-subtitle"),25);
        }  else if (userType.equalsIgnoreCase("Store Manager")) {
        lgnP.usernameField.sendKeys(ConfigurationReader.getProperty("salesmanager.username"));
        lgnP.passwordField.sendKeys(ConfigurationReader.getProperty("all.pw"));
        lgnP.loginBtn.click();
            BrowserUtils.waitForPresenceOfElement(By.className("oro-subtitle"),25);
    }


    }
    @When("The {string} is click the fleet menu and than click vehicles button")
    public void the_user_is_click_the_fleet_menu_and_than_click_vehicles_button(String userType) {
        if (userType.equalsIgnoreCase("Driver")){
            BrowserUtils.waitFor(3);
            fMGeneral.driverFleetBtn.click();
            fMGeneral.vehiclesBtn.click();

           // BrowserUtils.waitForClickablility(By.xpath("//a[@title='Filters']"),10);
        } else if (userType.equalsIgnoreCase("Sales Manager")) {
            BrowserUtils.waitFor(3);
            fMGeneral.salesStoreFleetBtn.click();
            fMGeneral.vehiclesBtn.click();

          //  BrowserUtils.waitForClickablility(By.xpath("//a[@title='Filters']"),10);

        }else if (userType.equalsIgnoreCase("Store Manager")) {
            BrowserUtils.waitFor(3);
            fMGeneral.salesStoreFleetBtn.click();
            fMGeneral.vehiclesBtn.click();
           // BrowserUtils.waitForClickablility(By.xpath("//a[@title='Filters']"),10);

        }

    }
    @When("The user click the filter icon")
    public void the_user_click_the_filter_icon() {
        BrowserUtils.waitFor(3);
        fMGeneral.filterIcon.click();

    }
    @Then("The user should see {string} button top left corner under the Cars header")
    public void the_user_should_see_button_top_left_corner_under_the_cars_header(String manageFilters) {
        BrowserUtils.waitForClickablility(By.xpath("//button[@type='button']/a"),10);
        String expected = "Manage filters";
        String actual= fMGeneral.manageFiltersBtn.getAttribute("textContent").trim();
        System.out.println("actual = " + actual);
        Assert.assertEquals("Manage filters Failed!!!",expected,actual);

    }










}
