Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I am on the SauceDemo login page
    When I enter valid credentials
    And I click the login button
    Then I should be redirected to the inventory page

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the SauceDemo login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message "Username and password do not match any user in this service"
