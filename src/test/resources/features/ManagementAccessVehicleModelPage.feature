Feature: Management can Access the Vehicle Model Page
  user story: As a store manager or sales manager, I should be able to access the Vehicle model page and see all Vehicle model information.

Scenario: Management can see all vehicle information displayed on Vehicle Model Page
  Given That Store Manager or Sales Manager is logged in
  And on the dashboard
  When Store Manager or Sales Manager clicks on “Vehicles Model” in the “Fleet” dropdown menu
  And is directed to the page titled “All Vehicles Model”
  Then verify that all Vehicle model information is displayed
