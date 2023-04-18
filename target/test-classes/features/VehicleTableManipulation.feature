@NAV10-222
Feature: As a user, I should be able to arrange vehicle table display, under the Fleet-Vehicle page

  Background: Given the user is already logged in as a driver
    Given User is on the login page
    When User logs in as a "driver"
    Then User is on the "Quick Launchpad" page
@NAV10-501
Scenario: Validate the default value of view per page dropdown
  When user hover over "Fleet" button
  And user clicks on "Vehicles" button
  And user is on the Cars page
  Then View Per Page value is 25

@NAV10-507
  Scenario: View Per Page has the options 10,25,50,100
    When user hover over "Fleet" button
    And user clicks on "Vehicles" button
    And user is on the Cars page
    And user clicks on View Per Page Button
    Then the user can see the options: 10, 25, 50 and 100
@NAV10-508
Scenario: Validate the user can sort a column in ascending order by clicking the column name
  When user hover over "Fleet" button
  And user clicks on "Vehicles" button
  And user is on the Cars page
  And user clicks on the Model Year column
  Then Model Year column is in ascending order