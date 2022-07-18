Feature: User can see the Grid Setting Button is located on the right side of the Reset Button
  user story: As a user, I should be able to see the Grid Setting Button on the right side of the Reset Button

  @GridSettingBtnLocation
  Scenario: User can see the Grid Setting Button located on the right side of the Reset Button
    Given That user is on the "Vehicles" Page under Fleet Module
    Then user should be able to see Grid Settings on the right side of the Reset button