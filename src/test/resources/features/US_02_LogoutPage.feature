Feature: As a user, I should be able to logout.


  @wip
  Scenario Outline: Verify user can log out from the app after clicking the "Log out" button
    Given user is on the login page
    When user logs in as "<userType>"
    Then user clicks on the profile icon
    Then user clicks the logout button
    And user should be redirected to the login page
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |




  Scenario Outline : Verify user can see 5 options under the profile name
    When user logs in as "<userType>"
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
    Then user clicks on the profile icon
    Then user clicks on the profile icon
    And following "<Options>" should be displayed:
      | Option                  |
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure Notifications |
      | Log out                 |



