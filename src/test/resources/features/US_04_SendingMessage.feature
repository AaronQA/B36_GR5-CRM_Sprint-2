@smoke
Feature:

  As a user
  I want to post a message by using the Message tab in the Activity Stream


  Scenario Outline: Successfully posting a message in the Activity Stream
    Given user logs in as "<userType>"
    When I select the Message tab
    And I type "Hello" in the message box
    And the person was not specified
    And I press the Send button
    Then I should see the error message "Please specify at least one person." appears in the Activity Stream


    Examples:
    | userType  |
    | hr        |
    | helpdesk  |
    | marketing |

  Scenario Outline: Successfully posting a message in the Activity Stream
    Given user logs in as "<userType>"
    When I select the Message tab
    And I press the Send button
    Then I should see the error message no Title  "The message title is not specified." appears in the Activity Stream


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    Scenario Outline: Successfully posting a message in the Activity Stream

      Given user logs in as "<userType>"
      When I select the Message tab
      And I click on message feed
      Then  user should see  message delivery is to 'All employees' by default
      Examples:
      |userType    |
      |hr          |
      |helpdesk    |
      |marketing   |

  Scenario Outline: Successfully posting a message in the Activity Stream
    Given user logs in as "<userType>"
    When I select the Message tab
    Then  user can cancel sending message at any time before sending.

    Examples:
      |userType    |
      |hr          |
      |helpdesk    |
      |marketing   |
















