
@login @hr
Feature: As a user, I should be able to send appreciation by clicking tab in the Activity Stream.

  Background


  Scenario: Verify that the user can send an appreciation by filling in the mandatory fields.
    Given user clicks on the More dropdown button
    And user selects Appreciation option
    And user clicks on Send Button
    Then user sees the Error message "The message title is not specified"


  Scenario: User attempts to send an appreciation without specifying a recipient
    Given user clicks on the More dropdown button
    When user selects Appreciation option
    And user removes all recipients
    And user clicks on Send Button
  Then user sees the Error message "Please specify at least one person."
