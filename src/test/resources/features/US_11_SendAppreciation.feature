

Feature: As a user, I should be able to send appreciation by clicking tab in the Activity Stream.

  @login @hr
  Scenario: Send an appreciation by filling in the mandatory fields
    Given user clicks on the More dropdown button
    And user selects Appreciation option
    And user clicks on Send Button
    Then user sees the Error message "The message title is not specified"
