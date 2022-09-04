Feature: Web Login
  Scenario: User should be able to logging with valid credentials
    Given the user is on home page
    And user navigates to login page
    When the user enters the valid credentials
    | Username | Password |
    | anupd    | anupd    |
#    And hits submit
    Then the user should be logged in successfully