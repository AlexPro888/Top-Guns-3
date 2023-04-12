
Feature: As a Driver, I should be able to use the Driver filter

  Background:  The user is already logged in as a driver
    Given The user is on the login page
    Then The user logs in as a "driver"

  @wip
  Scenario: The user can all the methods under Driver Filter menu
    When The user hover over Fleet button
    And The user clicks on Vehicles button
    And The user can access the Manage Filters button
    And The user can select Driver
    And The user clicks Driver:All button to reveal a filter search box
    And User clicks Contains dropdown
    Then User should see all options under Menu

      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |

  Scenario Outline: The user should correctly use "Starts-with" method

    When The user hover over Fleet button
    And The user clicks on Vehicles button
    And The user can access the Manage Filters button
    And The user can select Driver
    And The user clicks Driver:All button to reveal a filter search box
    And User clicks Contains dropdown
    And The user selects "Starts with" method
    And User enters "<keyword>"
    And User clicks update button
    Then Results should starts with specified "<keyword>"
    Examples:
      | keyword |
      | Mrs     |
      | Ms      |
      | Jacki   |

  Scenario Outline:The user should correctly use "Ends-with" method

    When The user hover over Fleet button
    And The user clicks on Vehicles button
    And The user can access the Manage Filters button
    And The user can select Driver
    And The user clicks Driver:All button to reveal a filter search box
    And User clicks Contains dropdown
    And The user selects "Ends with" method
    And User enters "<keyword>"
    And User clicks update button
    Then Results should end with specified "<keyword>"

    Examples:
      | keyword |
      | Price   |
      | an      |
      | ohns    |





