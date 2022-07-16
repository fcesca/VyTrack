Feature: User should be able to click refresh button

  @Refresh
  Scenario: Click refresh button
    Given user is on VyTrack login page
    When manager enters username "storemanager204"
    And manager enters password "UserUser123"
    And manager clicks login button
    When User clicks to Fleet dropdown
    And User clicks to "Vehicles" option
    Then User is on the "All Cars" page
    When User can see Refresh button
    And User clicks to Refresh button
    Then User observes no changes on the All Cars page
