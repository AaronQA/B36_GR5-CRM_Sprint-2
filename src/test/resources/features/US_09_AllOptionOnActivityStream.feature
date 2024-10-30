
Feature: Verify Activity Stream options

  As a user, I should be able to see all the options on the Activity Stream page.

  @login @hr
  Scenario Outline: Verify main options on the Activity Stream page
    Given the user is on the Activity Stream page
    When the user verifies that the  feed options are visible on the page
    Then the user verifies  the feed "<option>" options are as expected

    Examples:
      | option  |
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

  Scenario: Verify additional options under the MORE tab
    Given the MORE tab is displayed on the Activity Stream page
    When the user clicks on the MORE tab
    Then verify the following options are visible under the MORE tab as expected
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
