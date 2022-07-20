
Feature: User should be able to click refresh button

  @RefreshButton
  Scenario: Clicking refresh button
    Given user is logging in to VyTrack page
    When user clicking on Fleet dropdown menu
    And choose "Vehicles" option
    When user clicks Refresh button
    Then user should be able to refresh page

