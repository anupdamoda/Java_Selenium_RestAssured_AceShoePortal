Feature: Web Login
  Scenario: User should be able to logging with valid credentials
    Given the user is on login page
    When the user enters the valid credentials
    And hits submit
    Then the user should be logged in successfully