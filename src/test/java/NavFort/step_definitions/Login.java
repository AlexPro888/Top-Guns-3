package NavFort.step_definitions;

import NavFort.pages.BasePage;
import NavFort.utilities.BrowserUtils;
import NavFort.utilities.ConfigurationReader;
import NavFort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {
    BasePage login = new BasePage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
    }

    @When("The user logs in as a driver")
    public void the_user_logs_in_as_a_driver() {
       login.loginWithCredentials("user1", "UserUser123");
    }
    @Then("The user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {
        BrowserUtils.waitFor(3);
        String expectedResult = "Quick Launchpad";
        String actualResult = login.dashboard.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("The user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {
       login.loginWithCredentials("salesmanager101","UserUser123");
    }

    @When("The user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {
        login.loginWithCredentials("storemanager51", "UserUser123");
    }
    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        BrowserUtils.waitFor(3);
        String expectedResult = "Dashboard";
        String actualResult = login.dashboard.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
