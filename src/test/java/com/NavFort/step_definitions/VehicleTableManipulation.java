package com.NavFort.step_definitions;

import com.NavFort.pages.VehicleTableViewPage;
import com.NavFort.utilities.BrowserUtils;
import com.NavFort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class VehicleTableManipulation {
    VehicleTableViewPage vehicleTableViewPage = new VehicleTableViewPage();

    @When("user is on the Cars page")
    public void user_is_on_the_cars_page() {
        BrowserUtils.sleep(3);
        String expectedPageTitle = "Cars";
        String actualPageTitle = vehicleTableViewPage.pageTitle.getText();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @Then("View Per Page value is {int}")
    public void view_per_page_value_is (Integer int1) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.visibilityOf(vehicleTableViewPage.viewPerPageButton));

        String expectedDefaultValue = "25";
        String actualDefaultValue = vehicleTableViewPage.viewPerPageButton.getText();
        Assert.assertEquals(expectedDefaultValue, actualDefaultValue);

    }

    @And("user clicks on View Per Page Button")
    public void userClicksOnViewPerPageButton() {
        vehicleTableViewPage.viewPerPageButton.click();

    }


    @Then("the user can see the options: 10, 25, 50 and 100")
    public void theUserCanSeeTheOptions() {
        Assert.assertEquals("10", vehicleTableViewPage.viewPerPageOption10.getText());
        Assert.assertEquals("25", vehicleTableViewPage.viewPerPageOption25.getText());
        Assert.assertEquals("50", vehicleTableViewPage.viewPerPageOption50.getText());
        Assert.assertEquals("100", vehicleTableViewPage.viewPerPageOption100.getText());


    }

    @And("user clicks on the Model Year column")
    public void userClicksOnTheModelYearColumn() {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(vehicleTableViewPage.modelYear));
        wait.until(ExpectedConditions.elementToBeClickable(vehicleTableViewPage.modelYear));
        vehicleTableViewPage.modelYear.click();
        BrowserUtils.sleep(3);

    }

    @Then("Model Year column is in ascending order")
    public void modelYearColumnIsInAscendingOrder() {
        //BrowserUtils.sleep(5);
        int firstRecordedYearValue = Integer.parseInt(vehicleTableViewPage.firstRecordedYear.getText());
        int lastRecordedYearValue = Integer.parseInt(vehicleTableViewPage.lastRecordedYear.getText());
        Assert.assertTrue(firstRecordedYearValue<lastRecordedYearValue);

    }
    @And("user clicks on the filters button")
    public void userClicksOnTheFiltersButton() {
        vehicleTableViewPage.filtersButton.click();
    }
    @And("user clicks on Manage filters button")
    public void userClicksOnManageFiltersButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(vehicleTableViewPage.manageFiltersButton));
        vehicleTableViewPage.manageFiltersButton.click();

    }

    @And("user add one filter")
    public void userAddOneFilter() {
        List<WebElement> filtersRadioButtons=vehicleTableViewPage.filtersCheckBoxes;
        filtersRadioButtons.get(5).click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleTableViewPage.modelYearDropdown);
        vehicleTableViewPage.modelYearDropdown.click();


        vehicleTableViewPage.insertValueFilterBox.sendKeys("1984"+ Keys.ENTER);
BrowserUtils.sleep(3);
        String modelYearExpectedValue = "1984";
        String modelYearActualValue = vehicleTableViewPage.firstValueOfModelYear.getText();
        Assert.assertEquals(modelYearExpectedValue,modelYearActualValue);

    }

    @And("user clicks on the reset button")
    public void userClicksOnTheResetButton() {
vehicleTableViewPage.resetFiltersButton.click();
    }

    @Then("all filters are removed")
    public void allFiltersAreRemoved() {
Boolean isSelected = false;
        List<WebElement> filtersRadioButtons=vehicleTableViewPage.filtersCheckBoxes;
        for (WebElement eachFilter: filtersRadioButtons){
            if (eachFilter.isSelected()){
                isSelected= true;
            }else {
                isSelected=false;
            }
        }
       boolean expectedSelection = false;
        boolean actualSelection= isSelected;
        Assert.assertEquals(expectedSelection,actualSelection);
    }


}
