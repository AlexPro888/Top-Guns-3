package com.NavFort.step_definitions;

import com.NavFort.pages.AddEventPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import com.github.javafaker.Faker;
import com.sun.jna.Library;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AddEvent {


    Faker faker = new Faker();
    AddEventPage addEvent = new AddEventPage();


    @When("The user hover over {string} button")
    public void the_user_hover_over_button(String fleetBtn) {

        BrowserUtils.waitForVisibility(addEvent.fleetBtn, 5);
        BrowserUtils.hover(addEvent.fleetBtn);
    }

    @When("The user clicks on {string} button")
    public void the_user_clicks_on_button(String vehicleBtn) {
        BrowserUtils.waitForClickablility(addEvent.vehicleBtn,3);
        addEvent.vehicleBtn.click();
        BrowserUtils.waitFor(3);
    }

    @When("The user click on any vehicle")
    public void the_user_click_on_any_vehicle() {
        BrowserUtils.waitForPageToLoad(5);
        List<WebElement> carList = Driver.getDriver().findElements(By.xpath("//tbody[@tr]"));
        for (int i = 1; i < carList.size(); i++) {

            WebElement row = Driver.getDriver().findElement(By.xpath("//tbody/tr[" + i + "]"));
            row.click();
            BrowserUtils.waitFor(3);
            Assert.assertTrue("verify the add button is here", addEvent.addEventBtnClick.isDisplayed());
            Driver.getDriver().navigate().back();
            BrowserUtils.waitFor(2);
        }

    }

    @Then("The user can access the {string} page from the {string}")
    public void the_user_can_access_the_page_from_the(String addEventBtnClick, String generalInformation) {
BrowserUtils.waitFor(3);
        addEvent.car.click();

        BrowserUtils.waitFor(5);
        Assert.assertTrue(addEvent.addEventBtnClick.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @When("The user clicks on {string}")
    public void the_user_clicks_on(String addEventBtnClick) {
        BrowserUtils.waitFor(5);
        addEvent.addEventBtnClick.click();


    }

    @Then("The {string} page should pop up")
    public void the_page_should_pop_up(String string) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(addEvent.AddEventPopUp.isDisplayed());
        BrowserUtils.waitFor(3);
        addEvent.closeEventBtn.click();


    }

    @Then("User Should see Title, Owner, Organizer display name, Organizer email, Start Date, End Date as a compulsory field")
    public void user_should_see_title_owner_organizer_display_name_organizer_email_start_date_end_date_as_a_compulsory_field() {
       BrowserUtils.waitFor(5);
       Assert.assertEquals("Title*",addEvent.titleField.getText());
       BrowserUtils.waitFor(1);
       Assert.assertEquals("Owner*",addEvent.ownerField.getText());
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Organizer display name*",addEvent.organizerDisplayNameField.getText());
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Organizer email*",addEvent.organiserEmailField.getText());
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Start*",addEvent.startDateField.getText());
        BrowserUtils.waitFor(1);
        Assert.assertEquals("End*",addEvent.endtDateField.getText());
        BrowserUtils.waitFor(1);
    }


}

