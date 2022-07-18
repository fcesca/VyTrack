Feature: User can click Export Grid Dropdown in Vehicle Module on All Cars Page
  user story: As a user, I should be able to click the Export Grid dropdown.

  @ExportGridDropdown
  Scenario: User can click Export Grid Dropdown
    Given That user is logged in
    And user is on the "Vehicles" Page under Fleet Module
    Then user should be able to click Export Grid Dropdown