package com.NavFort.step_definitions;

import com.NavFort.pages.LoginPage;
import com.NavFort.pages.VehicleTableViewPage;
import com.NavFort.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class VehicleTableManipulation {







    @Then("user sees teh value of {string} is {int}")
    public void userSeesTehValueOfViewPerPageIs(int arg0) {
    VehicleTableViewPage vehicleTableViewPage = new VehicleTableViewPage();
        Select vehiclePerPage = new Select(vehicleTableViewPage.viewPerPageDropdown);
        System.out.println("vehiclePerPage.getFirstSelectedOption() = " + vehiclePerPage.getFirstSelectedOption());

    }
}
