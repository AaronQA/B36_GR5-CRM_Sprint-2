
  Feature: Sending a message in Activity Stream

    @login  @hr
    Scenario: Verify that the user can send a message by filling in mandatory fields
      Given the user is on the Activity Stream Message tab
      When the user fills in "Message content" with "Important update"
      And the user selects a "Recipient" as "John Doe"
      And the user clicks on the "Send" button
      Then the message is successfully sent
      And the user sees a confirmation message "Message sent successfully"

    Scenario: Verify that error messages are shown when mandatory fields are not filled
      Given the user is on the Activity Stream Message tab
      When the user leaves "Message content" blank
      And the user clicks on the "Send" button
      Then the user sees an error message "The message title is not specified."

      Given the user is on the Activity Stream Message tab
      When the user leaves "Recipient" blank
      And the user clicks on the "Send" button
      Then the user sees an error message "Please specify at least one person."

    Scenario: Verify that message delivery is set to 'All employees' by default
      Given the user is on the Activity Stream Message tab
      When the user begins to compose a message
      Then the "Recipient" field is set to "All employees" by default

    Scenario: Verify that the user can cancel sending the message before sending
      Given the user is on the Activity Stream Message tab
      When the user starts composing a message with content "Important update"
      And the user selects a "Recipient" as "John Doe"
      And the user clicks on the "Cancel" button
      Then the message is not sent
      And the message content is discarded

