@addEvent
Feature: As a Store Manager, I should be able to add an event
  Background: Given the user is already logged in as a store manager

    Scenario: The user can access the "Add Event" page from the "General Information" page
      When The user hover over "Fleet" button
      And The user clicks on "Vehicles" button
      And The user click on any vehicle
      Then The user can access the "Add Event" page from the "General Information"