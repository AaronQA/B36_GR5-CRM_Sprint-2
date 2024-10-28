
Feature: Verify Activity Stream options

  As a user, I should be able to see all the options on the Activity Stream page.

  @login @hr
  Scenario Outline: Verify main options on the Activity Stream page
    Given the user is on the Activity Stream page
    When the user checks for the "<option>" option
    Then the "<option>" option should be visible

    Examples:
      | option  |
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

  Scenario: Verify additional options under the MORE tab
    Given the user is on the Activity Stream page
    And the "MORE" tab is available
    When the user clicks on the "MORE" tab
    Then the following options should be visible under the MORE tab:
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
