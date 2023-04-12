Feature: As a driver, I should be able to see vehicle table view

  Background: Given the user is already logged in as a driver
    Given User is on the login page
    When User logs in as a "driver"
    Then User is on the "Quick Launchpad" page


  @NAV10-491
  Scenario: View Vehicle Information Table
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    Then user should see a table with all vehicle information displayed