#Author: your.email@your.domain.com
Feature: Add customer flow Validation

  Scenario: Add customer flow validation
    And user clicks the add customer button
    When user fill up the details by using OneDim List
    And user clicks the submit button
    Then user verifies the message

  Scenario: Add customer validation using 1D list concept
    And user clicks the add customer button
    When user fill up the details by using OneDim Map
    | suriya | kmar | su@gamail.com | address | 987654321 |
    And user clicks the submit button
    Then user verifies the message
