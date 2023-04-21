@NAV10-226 @smoke
Feature: As a Store Manager, I should be able to add an event

  Background:  The user is on the vehicles page
    Given The user is on the login page
    When The user logs in as a "store manager"
    Then The user is on the "Dashboard" page
    When The user hover over "Fleet" button
    Then The user clicks on "Vehicles" button

  @NAV10-489
  Scenario: The user can access the "Add Event" page from the "General Information" page

   When The user click on any vehicle
    Then The user can access the "Add Event" page from the "General Information"

  @NAV10-496
  Scenario: The user can click on "Add event" and "Add event" page should pop up
    When The user can access the "Add Event" page from the "General Information"
    And The user clicks on "Add event"
    Then The "Add event" page should pop up


  @NAV10-510
  Scenario: Compulsory fields are shown as below
    When The user can access the "Add Event" page from the "General Information"
    And The user clicks on "Add event"
    Then User Should see Title, Owner, Organizer display name, Organizer email, Start Date, End Date as a compulsory field



