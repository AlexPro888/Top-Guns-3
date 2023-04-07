package com.NavFort.step_definitions;
import com.NavFort.pages.AddEventPage;
import com.NavFort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddEvent {



    AddEventPage addEvent = new AddEventPage();



    @When("The user hover over {string} button")
    public void the_user_hover_over_button(String fleetBtn) {

        BrowserUtils.waitForVisibility(addEvent.fleetBtn, 5000);
        BrowserUtils.hover(addEvent.fleetBtn);
    }

    @When("The user clicks on {string} button")
    public void the_user_clicks_on_button(String vehicleBtn) {
        addEvent.vehicleBtn.click();
    }

    @When("The user click on any vehicle")
    public void the_user_click_on_any_vehicle() {
        BrowserUtils.waitForVisibility(addEvent.car, 5000);
      addEvent.car.click();


        }


    @Then("The user can access the {string} page from the {string}")
    public void the_user_can_access_the_page_from_the(String addEventBtnClick, String generalInformation) {
        BrowserUtils.waitForVisibility(addEvent.addEventBtnClick, 5000);
        Assert.assertTrue(addEvent.addEventBtnClick.isDisplayed());
    }

    @When("The user clicks on {string}")
    public void the_user_clicks_on(String addEventBtnClick) {
        BrowserUtils.waitForVisibility(addEvent.addEventBtnClick, 5000);
        addEvent.addEventBtnClick.click();
    }

    @Then("The {string} page should pop up")
    public void the_page_should_pop_up(String string) {
       Assert.assertTrue(addEvent.AddEventPopUp.isDisplayed());


    }


}
