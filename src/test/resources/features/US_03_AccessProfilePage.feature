Feature: As a user, I should be able to access my profile page.


@login @hr
Scenario: Verify user can access the My Profile page
  When the user navigates to the My Profile page
  Then the My Profile page should be accessible

  Scenario: Verify all sections are present on the My Profile page
    Given the user is on the My Profile page
    Then the "General" section should be visible and accessible
    And the "Drive" section should be visible and accessible
    And the "Tasks" section should be visible and accessible
    And the "Calendar" section should be visible and accessible
    And the "Conversations" section should be visible and accessible






