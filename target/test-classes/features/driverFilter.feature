Feature: Driver filter

  Background:For the scenarios in the feature file, user is expected to be on dashboard page
    Given user is on the dashboard page

  Scenario: User can select Driver Filter
    When user clicks Vehicles function under the Fleet menu
    And users click the Manage filters title
    Then user sees and selects the Driver Filter from dropdown menu



