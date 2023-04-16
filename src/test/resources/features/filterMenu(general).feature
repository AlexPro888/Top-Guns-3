Feature: Filter Menu(General)
  User Story :
  As a user, I should be able to filter the vehicle table, in the Fleet-Vehicle page


  @wip
  Scenario Outline: "Manage Filter" button should be visible
    Given The "<userType>" is already on the Fleet Management page
    When  The "<userType>" is click the fleet menu and than click vehicles button
    And   The user click the filter icon
    Then  The user should see "Manage filters" button top left corner under the Cars header
    Examples:
      | userType      |
      | Driver        |
      | Sales Manager |
      | Store Manager |
