Feature: As a user, I should be able to access my profile page.


@login @hr @wip
    Scenario Outline: user can view the following options on My Profile page.
      Given the user is logged in and navigates to the My Profile page
      When the user views the "<option>" section
      Then the "<option>" section should be visible

      Examples:
        | option        |
        | General       |
        | Drive         |
        | Tasks         |
        | Calendar      |
        | Conversations |








