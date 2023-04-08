package com.NavFort.step_definitions;

import com.NavFort.pages.AddEventPage;
import com.NavFort.pages.BasePage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddEvent {

    BasePage login = new BasePage();
    AddEventPage addEvent = new AddEventPage();



    @When("The user hover over {string} button")
    public void the_user_hover_over_button(String fleetBtn) {
        login.loginStoreManager();
        BrowserUtils.waitFor(6);
        BrowserUtils.hover(addEvent.fleetBtn);
    }

    @When("The user clicks on {string} button")
    public void the_user_clicks_on_button(String vehicleBtn) {
       addEvent.vehicleBtn.click();
    }

    @When("The user click on any vehicle")
    public void the_user_click_on_any_vehicle() {
        BrowserUtils.waitFor(6);
        addEvent.car.click();
    }

    @Then("The user can access the {string} page from the {string}")
    public void the_user_can_access_the_page_from_the(String addEventBtn, String generalInformation ) {
        BrowserUtils.waitFor(5);
        String actualAddEvent = "Add Event";
        String expectedAddEvent = addEvent.addEventbtn.getText();
        Assert.assertEquals(expectedAddEvent,actualAddEvent);
    }


}
