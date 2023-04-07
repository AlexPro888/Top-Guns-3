@NAV10-495
Feature: As a driver, I should be able to vehicle table view

  Background: Given the user is already logged in as a driver
    Given The user is on the login page
    When The user logs in as a "driver"
    Then The user is on the "Quick Launchpad" page


@NAV10-491
  Scenario: View Vehicle Information Table
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    Then user should see a table with all vehicle information displayed

  @NAV10-492
  Scenario: View Total Page Number
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    Then user should see the total page number displayed

  @NAV10-493
  Scenario: Navigate through Vehicle Information Pages
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    Then user should see the total page number displayed
    When user clicks the ">" button
    Then user should see the next page of vehicle information displayed
    When user clicks the "<" button
    Then user should see the previous page of vehicle information displayed

  @NAV10-494
  Scenario: View total recordings of vehicles
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    Then user should see total recordings of vehicles top of the table

