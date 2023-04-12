package com.NavFort.step_definitions;

import com.NavFort.pages.LoginPage;
import com.NavFort.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    private LoginPage loginPage = new LoginPage();
    private String currentURL;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.goLoginPage();
    }

    @When("The user logs in as a {string}")
    public void the_user_logs_in_as_a(String userType) {
        loginPage.loginAsUserType(userType);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("The user is on the {string} page")
    public void the_user_is_on_the_page(String expectedTitle) {
        BrowserUtils.waitFor(5);
        String actualTitle = loginPage.getSubtitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
