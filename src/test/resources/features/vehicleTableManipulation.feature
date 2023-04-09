@NAV10-222
Feature As a user, I should be able to arrange vehicle table display, under the Fleet-Vehicle page

  Background: Given the user is already logged in as a driver
    Given User is on the login page
    When User logs in as a "driver"
    Then User is on the "Quick Launchpad" page

  @NAV10-501
Scenario:Validate the value of 'View Per Page'
  When user hover over "Fleet" button
  And user clicks on "Vehicles" button
  Then  user sees the value of 'View Per Page' is 25

