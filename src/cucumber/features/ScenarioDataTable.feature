Feature: Submit Contact
  
  The main objective of this feature file is to submit a
  contact after filling all the fields.
  
  Using Data Tables allows for changes to be made directly 
  in the feature file with no need to change the code.

  Scenario: Submit form using valid data
    Given I am on the cool site
    When I navigate to the contact form page
    And I submit the form filled with data
      | Description | Field Name     | Value                |
      | Name        | name_field     | Fefe Fidida          |
      | Address     | address_field  | Rua Fedorenta        |
      | Postal Code | postcode_field | F3D 0R               |
      | Email       | email_field    | fefe_fidida@fedo.com |
    Then I check that the form has been submitted
 