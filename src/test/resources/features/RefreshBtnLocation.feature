Feature: User can see the Refresh Button is located on the left side of the Reset Button
  User Story:As a user I should be able to see refresh button on the left side of Reset button

  @RefreshBtnLocation
  Scenario: User should see the refresh button located on the left side of reset button
    Given That user is on the "Vehicles" page under fleet module
    Then user should be able to see Refresh on the left side of the Reset button