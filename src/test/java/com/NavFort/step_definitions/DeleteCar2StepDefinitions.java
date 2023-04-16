package com.NavFort.step_definitions;

import com.NavFort.pages.FleetVehiclesPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteCar2StepDefinitions {

    private LoginPage loginPage = new LoginPage();
    private FleetVehiclesPage fleetVehiclesPage = new FleetVehiclesPage();

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
        fleetVehiclesPage.goToFleetVehiclesPage();
    }
    @When("the user clicks on any of the vehicles row")
    public void the_user_clicks_on_any_of_the_vehicles_row() throws InterruptedException {
        // find the table element by its class id
        // find the first row element within the table
        WebElement firstRow = Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[1]"));
        Thread.sleep(5000);
        // click on the first row element
        firstRow.click();

    }
    @Then("the user is redirected to General Information page")
    public void the_user_is_redirected_to_general_information_page() {
        WebElement userFieldset = Driver.getDriver().findElement(By.xpath("//h5[@class='user-fieldset']"));
        String userFieldsetText = userFieldset.getText();
        String expected = "General Information";
        Assert.assertEquals(expected, userFieldsetText);
    }
    @Then("the user should see the Delete button on the General information page")
    public void the_user_should_see_the_delete_button_on_the_general_information_page() {
        //make sure the delete button exists
        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//a[@class=' btn icons-holder-text no-hash remove-button']"));
        Assert.assertNotNull(deleteButton);
        Assert.assertTrue(deleteButton.getText().contains("Delete"));
    }


    @Given("the user is on the General Information page")
    public void the_user_is_on_the_general_information_page() {
        fleetVehiclesPage.goToFleetVehiclesPage();
    }
    @When("the user clicks on Delete button")
    public void the_user_clicks_on_delete_button() throws InterruptedException {
        Thread.sleep(5000);

        WebElement firstRow = Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[1]"));

        WebElement dropDown = firstRow.findElement(By.xpath("//div[@class='more-bar-holder']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(dropDown).perform();

        WebElement deleteBtn = dropDown.findElement(By.xpath("//i[@class='fa-trash-o hide-text']"));

        deleteBtn.click();


    }

    @Then("the user should see Delete confirmation pop-up")
    public void the_user_should_see_delete_confirmation_pop_up() {
        WebElement confirmationPopup = Driver.getDriver().findElement(By.xpath("//div[@class='modal oro-modal-danger in']"));

        String popupHeaderText = confirmationPopup.findElement(By.className("modal-header")).findElement(By.tagName("h3")).getText();
        String expected = "Delete Confirmation";
        Assert.assertEquals(expected, popupHeaderText);
    }

    @When("the user confirms Delete on confirmation pop-up")
    public void the_user_confirms_delete_on_confirmation_pop_up() throws InterruptedException {
        WebElement confirmationPopup = Driver.getDriver().findElement(By.xpath("//div[@class='modal oro-modal-danger in']"));
        WebElement popupDeleteBtn = confirmationPopup.findElement(By.xpath("//a[@class='btn ok btn-danger']"));
        Thread.sleep(4000);
        popupDeleteBtn.click();


    }
    @Then("the user should see Car deleted message")
    public void the_user_should_see_car_deleted_message() {
        //car deleted message should appear
        WebElement deletedMessagePopup = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success fade in top-messages ']"));
        String expected = "Item deleted";

        Assert.assertTrue(deletedMessagePopup.getText().contains(expected));
    }



}
