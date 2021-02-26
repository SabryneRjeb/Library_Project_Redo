@login
Feature:As a user I should be able to login to the library app


  Scenario Outline: Student login
    Given user login as student with "<userName>" and "<password>"
    Then the student on Homepage
    Examples:
      | userName | password  |
      | student1 | password1 |
      | student2 | password2 |
      | student3 | password3 |

  Scenario Outline: librarian login
    Given user login as librarian with "<userName>" and "<password>"
    Then the librarian on Homepage
    Examples:
      | userName          | password          |
      | librarianUsername | librarianPassword |
