Feature: Create Poll in Activity Stream

  Scenario: Verify that "All employees" is the default delivery setting
    Given the user is on the Activity Stream page
    When the user clicks on the Poll tab
    Then the default delivery option should be "All employees"

  Scenario: Verify error message when creating a poll without a title
    Given the user is on the Activity Stream page
    When the user clicks on the Poll tab
    And the user fills in the question and answers but leaves the title blank
    And the user submits the poll
    Then an error message "The message title is not specified" should be displayed

  Scenario: Verify that a user can create a poll with a question and multiple answers
    Given the user is on the Activity Stream page
    When the user clicks on the Poll tab
    And the user enters a poll question and multiple answers
    And the user submits the poll
    Then a confirmation message should be displayed