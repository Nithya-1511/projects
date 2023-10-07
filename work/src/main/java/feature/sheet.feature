Feature: Yahoo Login functionality
  Scenario: User logs in with valid credentials
    Given User is on the Yahoo login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should be logged in successfully

  Scenario: User selects preferences
    Given User is logged in
    When User selects a checkbox
    And User selects a radio button
    Then User's preferences should be updated

  Scenario: User handles an alert
    Given User is logged in
    When User triggers an alert
    Then User should handle the alert

  Scenario: User waits for an element
    Given User is logged in
    When User performs a wait for an element
    Then User should see the element

  Scenario: User handles Excel data
    Given User has Excel data
    When User reads data from Excel
    Then User should process the data
