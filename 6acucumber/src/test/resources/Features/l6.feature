Feature: feature is  to test the login functionality

  Scenario: checking whether login is succesfull with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
