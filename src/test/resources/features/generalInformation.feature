@NAV10-221
Feature:
  As a user, I should be able to see detailed information of a specific vehicle, under the Fleet Vehicle module

  Scenario Outline: User can see the "General Information" page by clicking on any vehicle (row)
    Given User is on the login page
    Then User logs in as a "<user>"
    And User hover over "Fleet" tab
    And User clicks on the vehicles button
    When User click on any vehicle row
    Then User should see the General Information page

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |

#  Scenario Outline : The user can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
#    Given The user is on the login page
#    When The user logs in as a "<user>"
##    When The user hover over ellipsis at the end of the each row
##    And  The user clicks on Eye (View) icon
##    Then The user can see the "<GeneralInformationPage>" page
#
#    Examples:
#      | user          |
#      | sales manager |
#      | store manager |












