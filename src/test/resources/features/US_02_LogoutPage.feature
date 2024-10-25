Feature: As a user, I should be able to logout.

  Scenario: Logout with valid credentials
    Given I am logged in with valid credentials
    When I click the logout button
    Then I should be redirected to the login page