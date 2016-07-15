Feature: To test contact from works when there are no errors
  
  Scenario: Check form is validated then there are no errors
    Given I am on my website
    When I click on the contact link
    And populate the contact form
    Then I should be on the contact confirmation page
