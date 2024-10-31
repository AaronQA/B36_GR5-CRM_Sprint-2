Feature: As a user, I should be able to logout.

@wip
  Scenario Outline: Verify user can log out from the app after clicking the "Log out" button
    When user logs in as "<userType>"
    When user clicks on the profile icon
    Then user clicks the logout button
    And user should be redirected to the login page
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario: Verify user can see 5 options under the profile name
    When user logs in as "<userType>"
    When user clicks on their profile name
    Then following options should be displayed:
      | Option                  |
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure Notifications |
      | Log out                 |