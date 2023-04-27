@smoke
Feature:
  As a user, I should be able to see detailed information of a specific vehicle, under the Fleet Vehicle module

  @NAV10-524
  Scenario Outline: User can see the "General Information" page by clicking on any vehicle (row)
    Given User is on the login page
    Then User logs in as a "<user>"
    And "<user>" hover over Fleet tab and click vehicles button
    When User click on any vehicle row
    Then User should see the General Information header

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |

  @NAV10-525
  Scenario Outline: User can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
    Given User is on the login page
    Then User logs in as a "<user>"
    And "<user>" hover over Fleet tab and click vehicles button
    Then User should see the Cars table
    And "<user>" should see the ellipsis icon and hover over ellipsis then click the Eye icon
    Then User should see the General Information header

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |

  @NAV10-526
  Scenario Outline: Sales Manager and Store Manager should see the "Edit", "Delete" and "Add Event" buttons on the "General Information" page
    Given User is on the login page
    Then User logs in as a "<user>"
    And "<user>" hover over Fleet tab and click vehicles button
    Then User should see the Cars table
    And "<user>" should see the ellipsis icon and hover over ellipsis then click the Eye icon
    Then User should see the General Information header
    And User should see the Edit button
    And User should see the Delete button
    And User should see the Add Event button

    Examples:
      | user          |
      | sales manager |
      | store manager |















