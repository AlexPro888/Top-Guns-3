package com.NavFort.step_definitions;

import com.NavFort.pages.LoginPage;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCar2StepDefinitions {

    private LoginPage loginPage = new LoginPage();

    @Given("the user is already logged in as store manager")
    public void the_user_already_logged_in_as_store_manager(){

        loginPage.goLoginPage();

        //login as store manager
        String userType = "sales manager";
        loginPage.loginAsUserType(userType);
    }

    @Given("the user is on the Fleet Vehicles page")
    public void the_user_is_on_the_fleet_vehicles_page() throws InterruptedException {
        //redirect to fleet vehicles page
        String fleetVehiclesPageUrl = "https://qa.navfort.com/entity/Extend_Entity_Carreservation";
        Driver.getDriver().get(fleetVehiclesPageUrl);
    }
    @When("the user clicks on any of the vehicles row")
    public void the_user_clicks_on_any_of_the_vehicles_row() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user is redirected to General Information page")
    public void the_user_is_redirected_to_general_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should see the Delete button on the General information page")
    public void the_user_should_see_the_delete_button_on_the_general_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
