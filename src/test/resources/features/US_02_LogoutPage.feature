Feature: As a user, I should be able to logout.

  @wip_Shahnoza
  Scenario: Logout with valid credentials
    Given user logged in with valid credentials
    When user clicks the avatar icon
    When user click the logout button
    Then user should be redirected to the login page