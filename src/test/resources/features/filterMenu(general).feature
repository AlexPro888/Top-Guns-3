@NAV10-521 @smoke
Feature: Filter Menu(General)
  User Story :
  As a user, I should be able to filter the vehicle table, in the Fleet-Vehicle page


  @NAV10-517
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

  @NAV10-518
  Scenario Outline:  "Manage Filters" menu contains the filters
    Given The "<userType>" is already on the Fleet Management page
    When  The "<userType>" is click the fleet menu and than click vehicles button
    And   The user click the filter icon
    And  The user click "Manage filters" button
    Then  The user should see manage filters menu's contains filters
    Examples:
      | userType      |
      | Driver        |
      | Sales Manager |
      | Store Manager |

  @NAV10-519
  Scenario Outline: The user can find filters by typing the filter name, through the 'Manage Filters' menu.
    Given The "<userType>" is already on the Fleet Management page
    When  The "<userType>" is click the fleet menu and than click vehicles button
    And   The user click the filter icon
    And  The user click "Manage filters" button
    Then  The user types "<filtersName>" on the filter input box and displayed on the screen
    Examples:
      | userType      | filtersName |
      | Driver        | Tags        |
      | Sales Manager | Location    |
      | Store Manager | Horsepower  |

  @NAV10-520
  Scenario Outline: The user can apply multiple filters at the same time
    Given The "<userType>" is already on the Fleet Management page
    When  The "<userType>" is click the fleet menu and than click vehicles button
    And   The user click the filter icon
    And   The user click "Manage filters" button
    And   The user click on "Tags" ,"Location" , "Horsepower"
    Then  Verify that "Tags", "Location" and "Horsepower" options are selected
    Examples:
      | userType      |
      | Driver        |
      | Sales Manager |
      | Store Manager |

