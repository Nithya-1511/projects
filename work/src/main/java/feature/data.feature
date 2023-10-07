Feature: Login functionality

  Scenario Outline: User logs in with valid credentials
    Given User is on login page
    When User enters valid <username> and <password>
    And Clicks on Login button
    Then User is navigated to Home page
    And Close the browser

    Examples:
      | username      | password      |
      | problem_user  | secret_sauce  |
      | standard_user | secret_sauce  |