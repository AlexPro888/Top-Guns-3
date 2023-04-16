package com.NavFort.pages;

import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetVehiclesPage {

    private final String fleetVehiclesUrl = "https://qa.navfort.com/entity/Extend_Entity_Carreservation";

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[1])")
    private WebElement vehiclesTableFirstRow;


    public FleetVehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goToFleetVehiclesPage(){
        Driver.getDriver().get(fleetVehiclesUrl);
    }

    public String getFleetVehiclesUrl() {
        return fleetVehiclesUrl;
    }

    public WebElement getVehiclesTableFirstRow() {
        return vehiclesTableFirstRow;
    }

    public void setVehiclesTableFirstRow(WebElement vehiclesTableFirstRow) {
        this.vehiclesTableFirstRow = vehiclesTableFirstRow;
    }
}
