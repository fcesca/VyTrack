Feature: Management should be able to login with correct credentials


  @VyTrackManagementLogin
    Scenario: VyTrack Login
      Given user is on VyTrack login page
      When manager enters username "storemanager204"
      And manager enters password "UserUser123"
      And manager clicks login button
      Then manager should see VyTrack "Dashboard" page