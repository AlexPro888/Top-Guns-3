@NAV10-221
Feature:
  As a user, I should be able to see detailed information of a specific vehicle, under the Fleet Vehicle module

  Scenario Outline: User can see the "General Information" page by clicking on any vehicle (row)
    Given User is on the login page
    Then User logs in as a "<user>"
    And "<user>" hover over Fleet tab and click vehicles button
    When "<user>" click on any vehicle row
    Then "<user>" should see the General Information page

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |













