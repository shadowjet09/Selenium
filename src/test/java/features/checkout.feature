Feature: Test Checkout Process

  @web
  Scenario: Test web checkout process
    Given user go to login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user verify see cart icon
    And user click add to cart
    And user click cart icon
    Then user verify see checkout button
    And user click checkout button
    And user input first name "Michael"
    And user input last name "Hartono"
    And user input postal code "39515"
    And user click continue button
    Then user verify see finish button
    And user click finish button
    Then user verify see thank you page
