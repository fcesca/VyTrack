Feature: User should be able to login with valid credentials

  @VyTrackUserLogin
  Scenario: VyTrack Login
    Given user is on VyTrack login page
    When user enters username "User171"
    And user enters password "UserUser123"
    And user clicks on login button
    Then user should be able to see Vytrack "Dashboard" page

