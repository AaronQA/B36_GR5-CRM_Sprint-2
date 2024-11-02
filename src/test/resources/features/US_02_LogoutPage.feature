Feature: As a user, I should be able to logout.


  Scenario Outline: Verify user can log out from the app after clicking the "Log out" button
    When user logs in as "<userType>"
    Then user clicks on the profile dropdown
    Then user clicks the logout button
    And user should be redirected to the login page
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @US_02
  Scenario Outline: Verify user can see 5 options under the profile name
    When user logs in as "<userType>"
    Then user clicks on the profile dropdown
    And user should be able to see 5 options under profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |








