Feature: Functions on Company Structure in Employee page
  User Story: As a user, I should be able to use functions on Company Structure under Employee menu.


  @login @marketing @employees
  Scenario: Verify that the Company Structure is visible for all user types
    When the user navigates to the "Employees" page
    Then the "Company Structure" header should be visible on the page


  @login @hr @employees
  Scenario Outline: Verify that the HR user can add a department from the Company Structure
    When the user navigates to the "Employees" page
    And user clicks the "Add department" button
    And user enter the department name as "<department_name>"
    And user selects needed Parent department
    And user clicks the "Add" button
    Then the new department "<department_name>" should be added successfully

    Examples:
      | department_name      |
      | Department of Journaling |

  @login @helpdesk @employees
  Scenario: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users
    When the user navigates to the "Employees" page
    Then the "Add Department" button should not be visible to the user