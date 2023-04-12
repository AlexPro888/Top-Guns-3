@NAV10-221
Feature:General Information Page
  As a user, I should be able to see detailed information of a specific vehicle, under the Fleet Vehicle module

  Background:
    Given The user is on the login page

  Scenario Outline: The user can see the "General Information" page by clicking on any vehicle (row)
    When The user logs in as a "<user>"
    When The user hover over "Fleet" tab
    And The user clicks on "Vehicles" button
    And The user click on any vehicle row
    Then The user should see the "General Information" page

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |

  Scenario Outline : The user can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
    Given The user is on the login page
    When The user logs in as a "<user>"
    When The user hover over ellipsis at the end of the each row
    And  The user clicks on Eye (View) icon
    Then The user can see the "<GeneralInformationPage>" page

    Examples:
      | user          |
      | sales manager |
      | store manager |












