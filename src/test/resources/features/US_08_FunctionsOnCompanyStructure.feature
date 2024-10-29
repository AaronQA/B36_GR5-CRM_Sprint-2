Feature: Functions on Company Structure in Employee page
  User Story: As a user, I should be able to use functions on Company Structure under Employee menu.


@login @helpdesk
  Scenario: Verify that the Company Structure is visible for all user types
    When the user navigates to the "Employees" page
    Then the "Company Structure" header should be visible on the page


  @login @hr @employees
  Scenario Outline: Verify that the HR user can add a department from the Company Structure
    When the user navigates to the "Employees" page
    And user clicks the "Add department" button
    And user enter the department name as "<department_name>"
    And user selects " . Cyber Vet" as Parent department
    And user clicks the "Add" button
#    Then the new department "Department of Education" should be added successfully
#    And the "Finance" department should be visible in the list of departments
    Examples:
      | department_name         |
      | Department of Education |


#  Scenario Outline: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users
#    Given the <userType> is logged into the system
#    When the user navigates to the "Company Structure" page under the "Employees" menu
#    Then the "Add Department" button should not be visible to the user

