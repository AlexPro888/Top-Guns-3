Feature: As a 'Store Manager', I should be able to delete a car
  Background:
    Given the user is already logged in as store manager

  Scenario:  the user should see the  "Delete"  button on the "General Information" page
    Given the user is on the Fleet/Vehicles page
    When the user clicks on any of the vehicles row
    Then the user is redirected to General Information page
    And the user should see the Delete button on the General information page

  Scenario: the user should see the  "Delete Confirmation" pop-up after clicking on the Delete button
    Given the user is on the General Information page
    When the user clicks on Delete button
    Then the user should see Delete confirmation pop-up

  Scenario: the users can delete any vehicle from the 'General Information' page, by clicking on the 'Delete' button, and a "Car deleted" message should be displayed
    Given the user is on the General Information page
    When the user clicks on Delete button
    And the user confirms Delete on confirmation pop-up
    Then the user should see Car deleted message
