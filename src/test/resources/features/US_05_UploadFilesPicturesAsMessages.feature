Feature: User uploads files and pictures as messages
  User on the Active Stream page.

  As a user, I should be able to upload files and pictures as messages


  @login  @hr
  Scenario: Positive ,User uploads files and pictures
    When user selects the upload option
    And  user chooses a valid file
    Then system should upload the file successfully and user click insert in text button
    And  uploaded file or image should display in message input field

  Scenario Outline: verify user can upload and  supported files and pictures as messages
    Then supported "<file type>" are uploaded
    Examples:
      | file type |
      | .pdf      |
      | .txt      |
      | .jpeg     |
      | .png      |
      | .docx     |